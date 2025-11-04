package com.example.practica_kt.ui.components.componentsHome.componentsCard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.practica_kt.R

@Composable
fun ImageCard(ImageID: Int) {
    Box() {
        Image(
            painter = painterResource(id = ImageID),
            contentDescription = "Descripción de la imagen",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
    }
}

