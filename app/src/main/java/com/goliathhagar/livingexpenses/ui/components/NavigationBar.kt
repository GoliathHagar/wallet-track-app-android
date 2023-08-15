package com.goliathhagar.livingexpenses.ui.components

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.goliathhagar.livingexpenses.ui.routes.appScreens

@Composable
fun MyNavigationBar(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    BottomAppBar (
        actions ={
            appScreens.forEach { item ->
                NavigationBarItem(
                    alwaysShowLabel = false,
                    selected = currentRoute == item.route,
                    label = { Text(text = item.designation)},
                    onClick = { navController.navigate(item.route) },
                    icon = { Icon(item.icon, contentDescription = item.route) }
                )

            }

        },
        floatingActionButton = { MyFab() }
    )
}

@Preview
@Composable
fun MyNavigationBarPreview(){
    MyNavigationBar(rememberNavController())
}