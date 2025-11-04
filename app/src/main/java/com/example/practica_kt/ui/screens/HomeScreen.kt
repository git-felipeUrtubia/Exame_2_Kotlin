package com.example.practica_kt.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.practica_kt.ui.theme.Purple80
import com.example.practica_kt.ui.components.componentsHome.CardList

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Purple80),
        contentAlignment = Alignment.Center
    ) {
        CardList()
    }
}