package com.github.jameshnsears.chance.ui.zoom

import android.app.Application
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.github.jameshnsears.chance.data.R
import com.github.jameshnsears.chance.data.domain.core.Dice
import com.github.jameshnsears.chance.data.domain.core.Side
import com.github.jameshnsears.chance.data.domain.core.bag.DiceBag
import com.github.jameshnsears.chance.data.domain.core.roll.RollHistory
import com.github.jameshnsears.chance.data.domain.utility.svg.UtilitySvgSerializer
import com.github.jameshnsears.chance.data.repository.bag.RepositoryBagInterface
import com.github.jameshnsears.chance.data.repository.roll.RepositoryRollInterface
import com.github.jameshnsears.chance.data.repository.settings.RepositorySettingsInterface
import com.github.jameshnsears.chance.ui.dialog.bag.DialogBagCloseEvent
import com.github.jameshnsears.chance.ui.tab.bag.TabBagImportEvent
import com.github.jameshnsears.chance.ui.tab.roll.TabRollEvent
import com.github.jameshnsears.chance.ui.utility.colour.UtilityColour
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import timber.log.Timber

data class ZoomState(
    var resizeView: Dp,
    var diceBag: DiceBag,
    var diceBagDice: Dice,
    var rollHistory: RollHistory
)

class ZoomAndroidViewModel(
    application: Application,
    val repositorySettings: RepositorySettingsInterface,
    val repositoryBag: RepositoryBagInterface,
    val repositoryRoll: RepositoryRollInterface,
) : AndroidViewModel(application) {
    private val _stateFlowZoom = MutableStateFlow(
        ZoomState(
            resizeView = 0.dp,
            diceBag = mutableListOf(),
            diceBagDice = Dice(),
            rollHistory = LinkedHashMap()
        )
    )
    val stateFlowZoom: StateFlow<ZoomState> = _stateFlowZoom

    init {
        viewModelScope.launch {
            _stateFlowZoom.update {
                it.copy(
                    resizeView = resizeViewAsDp(repositorySettings.fetch().first().resize),
                    diceBag = repositoryBag.fetch().first(),
                    rollHistory = repositoryRoll.fetch().first()
                )
            }
        }

        viewModelScope.launch {
            DialogBagCloseEvent.sharedFlowDialogBagCloseEvent.collect {
                Timber.d("collect")

                removeRollSequenceWithDiceThatBeenDeleted()

                removeRollSequenceWithDiceWhereNumberOfSidesChanged()

                _stateFlowZoom.update {
                    it.copy(
                        diceBag = repositoryBag.fetch().first(),
                        rollHistory = repositoryRoll.fetch().first()
                    )
                }
            }
        }

        viewModelScope.launch {
            TabBagImportEvent.sharedFlowTabBagImportEvent.collect {
                Timber.d("collect")

                resizeView(repositorySettings.fetch().first().resize)
            }
        }

        viewModelScope.launch {
            TabRollEvent.sharedFlowTabRollEvent.collect {
                Timber.d("collect")
                _stateFlowZoom.update {
                    it.copy(
                        rollHistory = repositoryRoll.fetch().first()
                    )
                }
            }
        }
    }

    suspend fun removeRollSequenceWithDiceThatBeenDeleted() {
        val diceBagEpochs: MutableList<Long> = diceBagEpochs()

        val currentRollHistory = repositoryRoll.fetch().first()

        val rollHistoryWithValidDice = RollHistory()

        currentRollHistory.keys.forEach { rollSequenceEpoch ->

            val rolls = currentRollHistory.getValue(rollSequenceEpoch)

            var diceEpochMissing = false
            rolls.forEach { roll ->
                if (!diceBagEpochs.contains(roll.diceEpoch)) {
                    Timber.d("epoch.missing=${roll.diceEpoch}")
                    diceEpochMissing = true
                }
            }

            if (!diceEpochMissing)
                rollHistoryWithValidDice[rollSequenceEpoch] = rolls
        }

        repositoryRoll.store(rollHistoryWithValidDice)
    }

    suspend fun removeRollSequenceWithDiceWhereNumberOfSidesChanged() {
        val diceEpochsThatNoLongerInDiceBag: List<Long> =
            diceRollEpochs().minus(diceBagEpochs().toSet())

        val currentRollHistory = repositoryRoll.fetch().first()

        val rollHistoryWithValidDice = RollHistory()

        currentRollHistory.keys.forEach { rollSequenceEpoch ->

            val rolls = currentRollHistory.getValue(rollSequenceEpoch)

            var diceEpochMissing = false
            rolls.forEach { roll ->
                if (diceEpochsThatNoLongerInDiceBag.contains(roll.diceEpoch)) {
                    Timber.d("diceRollEpoch.missing=${roll.diceEpoch}")
                    diceEpochMissing = true
                }
            }

            if (!diceEpochMissing)
                rollHistoryWithValidDice[rollSequenceEpoch] = rolls
        }

        repositoryRoll.store(rollHistoryWithValidDice)
    }

    suspend fun diceRollEpochs(): MutableList<Long> {
        val currentRollHistory = repositoryRoll.fetch().first()

        val diceRollEpochs: MutableList<Long> = mutableListOf()

        currentRollHistory.keys.forEach { rollSequenceEpoch ->
            val rolls = currentRollHistory.getValue(rollSequenceEpoch)
            rolls.forEach { roll ->
                Timber.d("diceRollEpoch=${roll.diceEpoch}")
                diceRollEpochs.add(roll.diceEpoch)
            }
        }
        return diceRollEpochs
    }

    suspend fun diceBagEpochs(): MutableList<Long> {
        val diceBagEpochs: MutableList<Long> = mutableListOf()
        repositoryBag.fetch().first().forEach {
            Timber.d("diceBagEpoch=${it.epoch}")
            diceBagEpochs.add(it.epoch)
        }
        return diceBagEpochs
    }

    fun refreshAfterImport() {
        viewModelScope.launch {
            _stateFlowZoom.update {
                it.copy(
                    diceBag = repositoryBag.fetch().first(),
                    rollHistory = repositoryRoll.fetch().first()
                )
            }
        }
    }

    fun resizeView(resize: Int) {
        _stateFlowZoom.value = _stateFlowZoom.value.copy(
            resizeView = resizeViewAsDp(resize)
        )
    }

    private fun resizeViewAsDp(resize: Int): Dp {
        val defaultViewSize = 80.dp

        return when (resize) {
            1 -> defaultViewSize * 0.75f
            2 -> defaultViewSize * 0.8f
            3 -> defaultViewSize * 0.9f
            5 -> defaultViewSize * 1.1f
            6 -> defaultViewSize * 1.2f
            7 -> defaultViewSize * 1.25f
            else -> defaultViewSize
        }
    }

    fun sideImageShapeNumberFontSize() = 17.sp

    fun sideImageShapeNumberShape(dice: Dice): Int {
        return when (dice.sides.size) {
            2 -> R.drawable.d2
            6 -> R.drawable.d6
            10 -> R.drawable.d10
            12 -> R.drawable.d12
            else -> R.drawable.d4_d8_d20
        }
    }

    fun sideColourFilter(hexColour: String): ColorFilter {
        return if (hexColour == "")
            ColorFilter.tint(Color.Black)
        else
            ColorFilter.tint(UtilityColour.makeColor(hexColour))
    }

    fun sideColor(hexColour: String): Color {
        return if (hexColour == "")
            Color.White
        else
            UtilityColour.makeColor(hexColour)
    }

    fun diceContainsAtLeastOneSideWithDescription(dice: Dice): Boolean {
        dice.sides.forEach {
            it.description
            if (it.description != "")
                return true
        }

        return false
    }

    fun sideImageSVG(side: Side) =
        UtilitySvgSerializer.imageRequestFromBase64String(getApplication(), side.imageBase64)
}
