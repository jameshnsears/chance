package com.github.jameshnsears.chance.ui.dialog.bag.card.side.compose

import android.app.Application
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.github.jameshnsears.chance.data.domain.core.bag.testdouble.BagDataTestDouble
import com.github.jameshnsears.chance.data.repository.bag.testdouble.RepositoryBagTestDouble
import com.github.jameshnsears.chance.data.utility.UtilityDataHelper
import com.github.jameshnsears.chance.ui.dialog.bag.card.side.CardSideAndroidViewModel
import com.github.jameshnsears.chance.ui.theme.ChanceTheme
import io.mockk.mockk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking

@Preview(widthDp = 400, heightDp = 700)
@Composable
fun BagCardSidePreview() {
    val repositoryBagTestDouble =
        RepositoryBagTestDouble.getInstance(UtilityDataHelper().bagDataTestDouble.allDice)
    runBlocking(Dispatchers.Main) {
        repositoryBagTestDouble.store(
            mutableListOf(
                BagDataTestDouble().d6,
            ),
        )
    }

    val dice = BagDataTestDouble().diceStory

    val cardSideAndroidViewModel = runBlocking {
        CardSideAndroidViewModel(
            mockk<Application>(),
            dice.sides[0],
        )
    }

    ChanceTheme {
        Surface(
            color = MaterialTheme.colorScheme.background,
        ) {
            BagCardSide(
                cardSideAndroidViewModel,
            )
        }
    }
}
