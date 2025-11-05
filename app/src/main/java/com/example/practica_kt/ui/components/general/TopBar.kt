package com.example.practica_kt.ui.components.general

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.practica_kt.R
import com.example.practica_kt.ui.theme.BackgroundTopBotBar

@Composable
fun TopBar(selectedChange: (String) -> Unit) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(85.dp)
            .background(BackgroundTopBotBar),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Button(
            modifier = Modifier
                .width(50.dp)
                .height(50.dp),
            contentPadding = PaddingValues(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            ),
            onClick = { println("Hola Mundo") }

        ) {

            Icon(
                painter = painterResource(id = R.drawable.bell_off),
                contentDescription = "Bell",
                tint = Color.White,
                modifier = Modifier.size(25.dp)
            )
        }

        Text(
            "Tienda Gamer",
            color = Color.White
        )

        Button(
            modifier = Modifier
                .width(50.dp)
                .height(50.dp),
            contentPadding = PaddingValues(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            ),
            onClick = { selectedChange("pay") }
        ) {
            Icon(
                painter = painterResource(id = R.drawable.shopping),
                contentDescription = "Shopping",
                tint = Color.White,
                modifier = Modifier.size(27.dp)
            )
        }

    }
}

