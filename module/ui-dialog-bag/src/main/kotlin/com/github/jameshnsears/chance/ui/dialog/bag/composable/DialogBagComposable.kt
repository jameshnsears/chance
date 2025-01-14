package com.github.jameshnsears.chance.ui.dialog.bag.composable

import android.app.Application
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusTarget
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.github.jameshnsears.chance.data.domain.core.Dice
import com.github.jameshnsears.chance.data.domain.core.Side
import com.github.jameshnsears.chance.data.repository.bag.RepositoryBagInterface
import com.github.jameshnsears.chance.ui.dialog.bag.DialogBagAndroidViewModel
import com.github.jameshnsears.chance.ui.dialog.bag.card.dice.composable.BagCardDice
import com.github.jameshnsears.chance.ui.dialog.bag.card.roll.composable.BagCardRoll
import com.github.jameshnsears.chance.ui.dialog.bag.card.side.composable.BagCardSide
import timber.log.Timber

@Composable
fun DialogBag(
    showDialog: MutableState<Boolean>,
    repositoryBag: RepositoryBagInterface,
    dice: Dice,
    side: Side,
) {
    val application = LocalContext.current.applicationContext as Application

    Timber.d("DialogBag: dice.epoch=${dice.epoch}; side.uuid=${side.uuid}")

    Dialog(
        onDismissRequest = {
            showDialog.value = false
        },
        properties = DialogProperties(usePlatformDefaultWidth = false),
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            DialogBagLayout(
                showDialog,
                DialogBagAndroidViewModel(
                    application,
                    repositoryBag,
                    dice,
                    side,
                ),
            )
        }
    }
}

@Composable
fun DialogBagLayout(
    showDialog: MutableState<Boolean>,
    dialogBagAndroidViewModel: DialogBagAndroidViewModel
) {
    val stateFlowCardDice =
        dialogBagAndroidViewModel.cardDiceViewModel.stateFlowCardDice.collectAsStateWithLifecycle(
            lifecycleOwner = LocalLifecycleOwner.current
        )

    val diceCanBeDeleted = stateFlowCardDice.value.diceCanBeDeleted

    val diceCanBeCloned = stateFlowCardDice.value.diceCanBeCloned

    val diceCanBeSaved = stateFlowCardDice.value.diceCanBeSaved

    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize()
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .focusTarget()
                .padding(top = 4.dp, end = 4.dp),
        ) {
            IconButton(onClick = {
                showDialog.value = false
            }) {
                Icon(
                    imageVector = Icons.Outlined.Close,
                    contentDescription = "",
                )
            }

            Spacer(Modifier.weight(1f))

            TextButtonDelete(diceCanBeDeleted, dialogBagAndroidViewModel, showDialog)

            TextButtonClone(diceCanBeCloned, dialogBagAndroidViewModel, showDialog)

            TextButtonSave(diceCanBeSaved, dialogBagAndroidViewModel, showDialog)
        }

        Column(
            modifier = Modifier
                .padding(start = 8.dp, end = 8.dp),
        ) {
            BagCardSide(dialogBagAndroidViewModel.cardSideAndroidViewModel)

            BagCardDice(dialogBagAndroidViewModel.cardDiceViewModel)

            BagCardRoll(dialogBagAndroidViewModel.cardRollViewModel)
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(end = 4.dp),
        ) {
            Spacer(Modifier.weight(1f))

            TextButtonSave(diceCanBeSaved, dialogBagAndroidViewModel, showDialog)
        }
    }
}
