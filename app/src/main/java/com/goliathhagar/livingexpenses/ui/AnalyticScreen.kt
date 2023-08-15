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
import com.goliathhagar.livingexpenses.ui.routes.Analytics
import com.goliathhagar.livingexpenses.ui.routes.Destination


@Composable
fun AnalyticScreen( destination: Destination) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {

        Text(text = destination.designation, style = MaterialTheme.typography.titleLarge)
    }
}


@Preview
@Composable
fun AnalyticsPreview(){
    AnalyticScreen(destination = Analytics)
}