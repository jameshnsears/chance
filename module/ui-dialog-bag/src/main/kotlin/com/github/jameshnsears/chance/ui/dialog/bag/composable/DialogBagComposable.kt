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
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusTarget
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.github.jameshnsears.chance.data.domain.core.Dice
import com.github.jameshnsears.chance.data.domain.core.Side
import com.github.jameshnsears.chance.data.repository.bag.RepositoryBagInterface
import com.github.jameshnsears.chance.ui.dialog.bag.DialogBagAndroidViewModel
import com.github.jameshnsears.chance.ui.dialog.bag.R
import com.github.jameshnsears.chance.ui.dialog.bag.card.dice.composable.BagCardDice
import com.github.jameshnsears.chance.ui.dialog.bag.card.roll.composable.BagCardRoll
import com.github.jameshnsears.chance.ui.dialog.bag.card.side.composable.BagCardSide
import com.github.jameshnsears.chance.ui.dialog.confirm.composable.DialogConfirm
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

@Composable
private fun TextButtonDelete(
    diceTitleIsUnique: Boolean,
    dialogBagAndroidViewModel: DialogBagAndroidViewModel,
    showDialog: MutableState<Boolean>
) {
    val showDialogConfirm = remember { mutableStateOf(false) }

    TextButton(
        enabled = diceTitleIsUnique,
        onClick = {
            showDialogConfirm.value = true
        },
    ) {
        Text(
            text = stringResource(R.string.dialog_bag_delete),
            textAlign = TextAlign.End,
            fontSize = 16.sp,
        )
    }

    if (showDialogConfirm.value) {
        DialogConfirm(
            openDialog = showDialogConfirm.value,
            onDismissRequest = {
                showDialogConfirm.value = false
            },
            onConfirmation = {
                dialogBagAndroidViewModel.delete()
                showDialog.value = false
            },
            title = stringResource(R.string.dialog_bag_delete_confirmation),
            text = stringResource(R.string.dialog_bag_delete_confirmation_question)
        )
    }
}

@Composable
private fun TextButtonClone(
    diceTitleIsUnique: Boolean,
    dialogBagAndroidViewModel: DialogBagAndroidViewModel,
    showDialog: MutableState<Boolean>
) {
    TextButton(
        enabled = diceTitleIsUnique,
        onClick = {
            dialogBagAndroidViewModel.clone()
            showDialog.value = false
        },
    ) {
        Text(
            text = stringResource(R.string.dialog_bag_clone),
            textAlign = TextAlign.End,
            fontSize = 16.sp,
        )
    }
}

@Composable
private fun TextButtonSave(
    diceTitleIsUnique: Boolean,
    dialogBagAndroidViewModel: DialogBagAndroidViewModel,
    showDialog: MutableState<Boolean>
) {
    TextButton(
        enabled = diceTitleIsUnique,
        onClick = {
            dialogBagAndroidViewModel.save()
            showDialog.value = false
        },
    ) {
        Text(
            text = stringResource(R.string.dialog_bag_save),
            textAlign = TextAlign.End,
            fontSize = 16.sp,
        )
    }
}

@Composable
fun TabLayout() {
    var selectedTabIndex by remember { mutableStateOf(0) }
    val tabs = listOf(
        TabItem("Home", Icons.Default.Home),
        TabItem("Favorites", Icons.Default.Favorite),
        TabItem("Settings", Icons.Default.Settings)
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
        TabContent(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            selectedTabIndex = selectedTabIndex
        )
    }
}

@Composable
fun TabContent(modifier: Modifier, selectedTabIndex: Int) {
    when (selectedTabIndex) {
        0 -> HomeContent(modifier)
        1 -> FavoritesContent(modifier)
        2 -> SettingsContent(modifier)
    }
}

@Composable
fun HomeContent(modifier: Modifier) {
    Text(text = "Home Content", modifier = modifier)
}

@Composable
fun FavoritesContent(modifier: Modifier) {
    Text(text = "Favorites Content", modifier = modifier)
}

@Composable
fun SettingsContent(modifier: Modifier) {
    Text(text = "Settings Content", modifier = modifier)
}

data class TabItem(val title: String, val icon: ImageVector)
