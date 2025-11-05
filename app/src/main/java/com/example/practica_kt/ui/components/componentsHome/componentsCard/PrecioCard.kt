package com.example.practica_kt.ui.components.componentsHome.componentsCard

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.practica_kt.ui.scripts.formatNumberToCLP


@Composable
fun PrecioCard(precio: Int) {
    val precioFormatCLP = formatNumberToCLP(precio)
    Box(
        modifier = Modifier
            .padding(10.dp, 0.dp)
    ) {
        Text(
            text = "$${precioFormatCLP.toString()}",
            color = Color.White
        )
    }
}