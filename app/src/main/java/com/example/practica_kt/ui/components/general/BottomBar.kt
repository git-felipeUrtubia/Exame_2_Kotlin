package com.example.practica_kt.ui.components.general

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.practica_kt.R
import com.example.practica_kt.ui.theme.BackgroundTopBotBar


@Composable
fun BottomBar(selectedChange: (String) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .background(BackgroundTopBotBar),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {

        Button(
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            ),
            onClick = { selectedChange("home") }
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.house),
                    contentDescription = "Home",
                    tint = Color.White,
                    modifier = Modifier.size(25.dp)
                )
                Text(
                    text = "Home"
                )
            }
        }


        Button(
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            ),
            onClick = { selectedChange("about") } // cambia la pestaña seleccionada
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.about),
                    contentDescription = "About",
                    tint = Color.White,
                    modifier = Modifier.size(25.dp)
                )
                Text(
                    text = "About"
                )
            }
        }


        Button(
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            ),
            onClick = { selectedChange("profile") } // cambia la pestaña seleccionada
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.person_circle),
                    contentDescription = "Profile",
                    tint = Color.White,
                    modifier = Modifier.size(25.dp)
                )
                Text(
                    text = "Profile"
                )
            }
        }
    }

}



