package com.example.practica_kt.ui.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.practica_kt.ui.screens.AboutScreen
import com.example.practica_kt.ui.screens.HomeScreen
import com.example.practica_kt.ui.screens.PayScreen
import com.example.practica_kt.ui.screens.ProfileScreen


@Composable
fun NavRoutes(innerPadding: PaddingValues, selected: String) {
    Box(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        when (selected) {
            ScreenKeys.HOME -> { HomeScreen() }
            ScreenKeys.ABOUT -> { AboutScreen() }
            ScreenKeys.PROFILE -> { ProfileScreen() }
            ScreenKeys.PAY -> { PayScreen() }
        }
    }
}



