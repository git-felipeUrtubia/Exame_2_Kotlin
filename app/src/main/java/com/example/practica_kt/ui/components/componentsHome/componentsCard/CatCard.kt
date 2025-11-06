package com.example.practica_kt.ui.components.componentsHome.componentsCard

import android.R
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CatCard(cat: String) {
    Box(
        modifier = Modifier.padding(8.dp, 0.dp)
    ) {
        Text(
            text = cat,
            color = Color.White
        )
    }
}