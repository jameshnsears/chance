package com.github.jameshnsears.chance.ui.dialog.colour.composable

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.res.stringResource
import com.github.jameshnsears.chance.ui.dialog.bag.R
import com.github.jameshnsears.chance.ui.utility.preview.UtilityPreview

@Composable
@UtilityPreview
fun DialogColorPickerPreview() {
    val showColourDialog = rememberSaveable { mutableStateOf(true) }

    DialogColourPickerLayout(
        showColourDialog,
        stringResource(R.string.dialog_bag_colour_picker_side),
        "FF000000",
        fun(_: String) {
            // no need to setColour
        },
    )
}
