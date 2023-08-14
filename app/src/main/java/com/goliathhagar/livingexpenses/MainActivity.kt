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
import com.goliathhagar.livingexpenses.ui.components.MyNavigationBar
import com.goliathhagar.livingexpenses.ui.theme.LivingExpensesTheme

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LivingExpensesTheme {
                HomeScreen()
            }
        }
    }
}

@Composable
fun HomeScreen(){
    Scaffold (

        bottomBar = { MyNavigationBar() },
    )
    {
            contentPadding ->
        // Screen content
        Box(modifier = Modifier.padding(contentPadding)) { /* ... */ }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LivingExpensesTheme {
        HomeScreen()
    }
}