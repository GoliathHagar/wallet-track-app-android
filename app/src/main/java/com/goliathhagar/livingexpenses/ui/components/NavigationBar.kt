package com.goliathhagar.livingexpenses.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyNavigationBar(){
    var selectedItem by rememberSaveable {
        mutableIntStateOf(0)
    }
    val list = listOf("Home", "tab2", "tab3", "tab4")
    BottomAppBar (
        actions ={
            list.forEachIndexed { index, item ->
                NavigationBarItem(
                    alwaysShowLabel = false,
                    selected = selectedItem == index,
                    label = { Text(text = item)},
                    onClick = { selectedItem = index},
                    icon = { Icon(Icons.Outlined.Build, contentDescription = item) }
                )

            }

        },
        floatingActionButton = { MyFab() }
    )
}

@Preview
@Composable
fun MyNavigationBarPreview(){
    MyNavigationBar()
}