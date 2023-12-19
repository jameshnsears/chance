package com.github.jameshnsears.chance.ui.tab

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.github.jameshnsears.chance.ui.theme.ChanceTheme

@Preview
@Composable
fun TabComposablePreview() {
    ChanceTheme {
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {
            TabRowChance(
            )
        }
    }
}