package com.example.practica_kt.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.practica_kt.ui.theme.Purple80
import com.example.practica_kt.ui.components.componentsHome.CardList
import com.example.practica_kt.ui.theme.BackgroundHome

@Composable
fun HomeScreen(exportChangeVisible: (Boolean) -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundHome),
        contentAlignment = Alignment.Center
    ) {
        CardList(
            exportChangeVisible = { isVisible ->
                exportChangeVisible(isVisible)
            }
        )
    }
}