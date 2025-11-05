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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practica_kt.R
import com.example.practica_kt.ui.theme.BackgroundTopBotBar

@Composable
fun TopBar(
    selectedChange: (String) -> Unit,
    count: Int,
    isVisible: Boolean
) {

    println("VISIBLE (TopBar): $isVisible")


    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .background(BackgroundTopBotBar)
            .padding(16.dp, 0.dp, 16.dp, 10.dp),
        verticalAlignment = Alignment.Bottom,
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
            Box(
                modifier = Modifier.background(Color.Transparent)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.shopping),
                    contentDescription = "Shopping",
                    tint = Color.White,
                    modifier = Modifier.size(27.dp)
                )
                if (isVisible) {
                    Box(
                        modifier = Modifier.offset(x = 15.dp, y = (-5).dp) // sale del borde del Box padre
                    ) {
                        Box(
                            modifier = Modifier
                                .size(18.dp)
                                .clip(CircleShape)
                                .background(Color.Red),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = count.toString(),
                                fontSize = 12.sp,
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }

    }
}

