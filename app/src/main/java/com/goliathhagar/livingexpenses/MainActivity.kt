package com.goliathhagar.livingexpenses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.goliathhagar.livingexpenses.ui.components.MyNavigationBar
import com.goliathhagar.livingexpenses.ui.routes.AppNavigation
import com.goliathhagar.livingexpenses.ui.theme.LivingExpensesTheme

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){
    val navController = rememberNavController()

    LivingExpensesTheme {
        Scaffold(

            bottomBar = { MyNavigationBar(navController) },
        )
        { contentPadding ->
            // Screen content
            Box(modifier = Modifier.padding(contentPadding)) { /* ... */ }
            AppNavigation(navController = navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    LivingExpensesTheme {
        HomeScreen()
    }
}