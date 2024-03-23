package com.github.jameshnsears.chance.ui.dialog.roll.compose

import android.annotation.SuppressLint
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.github.jameshnsears.chance.data.repository.bag.mock.RepositoryBagTestDouble
import com.github.jameshnsears.chance.data.repository.roll.mock.RepositoryRollTestDouble
import com.github.jameshnsears.chance.data.repository.settings.mock.RepositorySettingsTestDouble
import com.github.jameshnsears.chance.ui.tab.roll.TabRollViewModel
import com.github.jameshnsears.chance.ui.theme.ChanceTheme
import com.github.jameshnsears.chance.ui.utility.preview.UtilityPreview

@SuppressLint("UnrememberedMutableState")
@UtilityPreview
@Composable
fun DialogBagPreview() {
    ChanceTheme {
        Surface(
            color = MaterialTheme.colorScheme.background,
        ) {
            DialogRollLayout(
                TabRollViewModel(
                    RepositorySettingsTestDouble.getInstance(),
                    RepositoryBagTestDouble.getInstance(),
                    RepositoryRollTestDouble.getInstance()
                )
            )
        }
    }
}