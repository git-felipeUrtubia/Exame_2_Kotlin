package com.example.practica_kt.ui.components.general

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun BottomBar(selectedChange: (String) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.LightGray),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {

        Button(
            onClick = { selectedChange("home") }
        ) {
            Text("Home") // El texto que se ve en el botón
        }


        Button(
            onClick = { selectedChange("about") } // cambia la pestaña seleccionada
        ) {
            Text("about") // El texto que se ve en el botón
        }


        Button(
            onClick = { selectedChange("profile") } // cambia la pestaña seleccionada
        ) {
            Text("Profile") // El texto que se ve en el botón
        }
    }

}



