package com.example.practica_kt.ui.components.componentsHome.componentsCard

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun PrecioCard(precio: Int) {
    val precioToString = precio.toString()
    Box(
        modifier = Modifier
            .padding(10.dp, 0.dp)
    ) {
        Text(
            text = "$${precioToString}"
        )
    }
}