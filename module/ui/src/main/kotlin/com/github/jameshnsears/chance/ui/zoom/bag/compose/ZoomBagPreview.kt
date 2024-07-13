package com.github.jameshnsears.chance.ui.zoom.bag.compose

import android.app.Application
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.github.jameshnsears.chance.data.utility.UtilityDataHelper
import com.github.jameshnsears.chance.ui.theme.ChanceTheme
import com.github.jameshnsears.chance.ui.utility.preview.UtilityPreview
import com.github.jameshnsears.chance.ui.zoom.ZoomAndroidViewModel
import io.mockk.mockk

@UtilityPreview
@Composable
fun ZoomBagPreview() {
    val repositoryBag = UtilityDataHelper().repositoryBag

    val repositoryRoll = UtilityDataHelper().repositoryRoll

    ChanceTheme {
        Surface(
            color = MaterialTheme.colorScheme.background,
        ) {
            ZoomBag(
                ZoomAndroidViewModel(
                    mockk<Application>(),
                    repositoryBag,
                    repositoryRoll
                ),
            )
        }
    }
}
