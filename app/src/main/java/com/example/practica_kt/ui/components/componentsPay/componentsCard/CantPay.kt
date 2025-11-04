package com.example.practica_kt.ui.components.componentsPay.componentsCard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun CantPay(count: Int, onClickInc: () -> Unit, onClickDec: () -> Unit, isEnabled: Boolean = true) {
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = onClickDec,
                enabled = isEnabled
            ) {
                Text("-")
            }

            Spacer(modifier = Modifier.width(16.dp))

            Text(count.toString())

            Spacer(modifier = Modifier.width(16.dp))

            Button(
                onClick = onClickInc
            ) {
                Text("+")
            }
        }
    }
}

