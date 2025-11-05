package com.example.practica_kt.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.practica_kt.ui.components.componentsHome.GamesSelected
import com.example.practica_kt.ui.components.general.BottomBar
import com.example.practica_kt.ui.components.general.TopBar
import com.example.practica_kt.ui.navigation.NavRoutes

@Composable
fun AppContent() {

    var selected by remember { mutableStateOf("home") }
    val isVisible = remember { mutableStateOf(false) }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopBar(
                selectedChange = { newValue -> selected = newValue },
                GamesSelected.distinct().size,
                isVisible.value
            )
        },
        bottomBar = {
            BottomBar(selectedChange = { newValue -> selected = newValue })
        }

    ) { innerPadding ->
        NavRoutes(
            innerPadding,
            selected,
            exportChangeVisible = { newIsVisible ->
                isVisible.value = newIsVisible
            }
        )
    }
}

