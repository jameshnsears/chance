package com.github.jameshnsears.chance.ui.dialog.bag.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.github.jameshnsears.chance.ui.dialog.bag.DialogBagAndroidViewModel
import com.github.jameshnsears.chance.ui.dialog.bag.R
import com.github.jameshnsears.chance.ui.dialog.bag.card.dice.composable.BagCardDice
import com.github.jameshnsears.chance.ui.dialog.bag.card.roll.composable.BagCardRoll
import com.github.jameshnsears.chance.ui.dialog.bag.card.side.composable.BagCardSide

@Composable
fun DialogBagTabLayout(
    dialogBagAndroidViewModel: DialogBagAndroidViewModel
) {
    var selectedTabIndex by remember { mutableStateOf(0) }

    val tabs = listOf(
        TabItem(
            stringResource(R.string.dialog_bag_dice),
            ImageVector.vectorResource(R.drawable.dice)
    ),

        TabItem(
            stringResource(R.string.dialog_bag_side_title),
            ImageVector.vectorResource(R.drawable.side)
        ),

        TabItem(
            stringResource(R.string.dialog_bag_roll),
            ImageVector.vectorResource(R.drawable.behaviour)
        )
    )

    Scaffold(
        topBar = {
            TabRow(selectedTabIndex = selectedTabIndex) {
                tabs.forEachIndexed { index, tab ->
                    Tab(
                        selected = selectedTabIndex == index,
                        onClick = { selectedTabIndex = index },
                        icon = {
                            Icon(
                                imageVector = tab.icon,
                                contentDescription = tab.title
                            )
                        },
                        text = { Text(tab.title) }
                    )
                }
            }
        }
    ) { innerPadding ->
        DialogBagTabContent(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            dialogBagAndroidViewModel,
            selectedTabIndex = selectedTabIndex
        )
    }
}

@Composable
fun DialogBagTabContent(
    modifier: Modifier,
    dialogBagAndroidViewModel: DialogBagAndroidViewModel,
    selectedTabIndex: Int
) {
    when (selectedTabIndex) {
        0 -> DiceContent(modifier, dialogBagAndroidViewModel)
        1 -> SideContent(modifier, dialogBagAndroidViewModel)
        2 -> BehaviourContent(modifier, dialogBagAndroidViewModel)
    }
}

@Composable
fun DiceContent(
    modifier: Modifier,
    dialogBagAndroidViewModel: DialogBagAndroidViewModel
) {
    BagCardDice(dialogBagAndroidViewModel.cardDiceViewModel)
}

@Composable
fun SideContent(
    modifier: Modifier,
    dialogBagAndroidViewModel: DialogBagAndroidViewModel
) {
    BagCardSide(dialogBagAndroidViewModel.cardSideAndroidViewModel)
}

@Composable
fun BehaviourContent(
    modifier: Modifier,
    dialogBagAndroidViewModel: DialogBagAndroidViewModel
) {
    BagCardRoll(dialogBagAndroidViewModel.cardRollViewModel)
}

data class TabItem(val title: String, val icon: ImageVector)
