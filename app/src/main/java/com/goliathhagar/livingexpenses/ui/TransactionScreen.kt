package com.goliathhagar.livingexpenses.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.goliathhagar.livingexpenses.ui.routes.Destination
import com.goliathhagar.livingexpenses.ui.routes.Transactions
import java.util.Locale


@Composable
fun TransactionScreen( destination: Destination) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue),
        contentAlignment = Alignment.Center
    ) {
        val name = destination.route.replaceFirstChar { 
            if (it.isLowerCase()) it.titlecase(Locale.ROOT) else it.toString()
        }
        Text(text = name, style = MaterialTheme.typography.titleLarge)
    }
}


@Preview
@Composable
fun TransactionsPreview(){
    TransactionScreen(destination = Transactions)
}