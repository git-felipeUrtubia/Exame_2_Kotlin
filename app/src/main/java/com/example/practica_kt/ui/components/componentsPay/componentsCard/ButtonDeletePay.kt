package com.example.practica_kt.ui.components.componentsPay.componentsCard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.practica_kt.R


@Composable
fun ButtonDeletePay(onClick: () -> Unit) {
    Box(
        modifier = Modifier.padding(8.dp)
    ) {
        Button(
            onClick = onClick,
            modifier = Modifier
                .width(45.dp)
                .height(50.dp),
            shape = RoundedCornerShape(8.dp),
            contentPadding = PaddingValues(5.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red
            )
        ) {
            Icon(
                painter = painterResource(id = R.drawable.trash),
                contentDescription = "trash",
                tint = Color.White,
                modifier = Modifier.size(25.dp)
            )
        }
    }
}

