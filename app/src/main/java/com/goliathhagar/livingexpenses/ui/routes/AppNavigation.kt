package com.goliathhagar.livingexpenses.ui.routes

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.goliathhagar.livingexpenses.ui.AnalyticScreen
import com.goliathhagar.livingexpenses.ui.CategoryScreen
import com.goliathhagar.livingexpenses.ui.OverviewScreen
import com.goliathhagar.livingexpenses.ui.TransactionScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Overview.route) {
        composable(Overview.route) { OverviewScreen(Overview) }
        composable(Categories.route) { CategoryScreen(Categories) }
        composable(Analytics.route) { AnalyticScreen(Analytics) }
        composable(Transactions.route) { TransactionScreen(Transactions) }
    }
}