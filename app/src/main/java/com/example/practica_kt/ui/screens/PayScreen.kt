package com.example.practica_kt.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.practica_kt.ui.components.componentsPay.CardProdsSelected
import com.example.practica_kt.ui.theme.Pink80
import com.example.practica_kt.ui.theme.PurpleGrey80

@Composable
fun PayScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(PurpleGrey80),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            CardProdsSelected()
        }
    }
}