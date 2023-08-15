package com.goliathhagar.livingexpenses.ui.routes

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DashboardCustomize
import androidx.compose.material.icons.filled.PieChart
import androidx.compose.material.icons.filled.ReceiptLong
import androidx.compose.material.icons.filled.StackedBarChart
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Contract for information needed on every navigation destination
 */

interface Destination {
    val icon: ImageVector
    val route: String
    val designation : String
}

/**
* App navigation destinations
*/
object Overview : Destination {
    override val icon = Icons.Filled.DashboardCustomize
    override val route = "overview"
    override val designation = "Overview"
}
object Analytics : Destination {
    override val icon = Icons.Filled.StackedBarChart
    override val route = "analytics"
    override val designation = "Analytics"
}
object Transactions : Destination {
    override val icon = Icons.Filled.ReceiptLong
    override val route = "transactions"
    override val designation = "Transactions"
}
object Categories : Destination {
    override val icon = Icons.Filled.PieChart
    override val route = "categories"
    override val designation = "Categories"
}

// Screens to be displayed in the bottom bar
val appScreens = listOf(Overview, Categories, Analytics, Transactions)