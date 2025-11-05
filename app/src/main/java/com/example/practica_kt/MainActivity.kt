package com.example.practica_kt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.practica_kt.ui.components.AppContent
import com.example.practica_kt.ui.components.componentsHome.GamesSelected
import com.example.practica_kt.ui.components.general.BottomBar
import com.example.practica_kt.ui.components.general.TopBar
import com.example.practica_kt.ui.navigation.NavRoutes
import com.example.practica_kt.ui.theme.Practica_KTTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practica_KTTheme {
                AppContent()
            }
        }
    }
}

