package com.example.practica_kt.ui.components.componentsPay.componentsCard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.example.practica_kt.ui.theme.ButtonsPay


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
                modifier = Modifier
                    .width(35.dp)
                    .height(35.dp),
                shape = RoundedCornerShape(5.dp),
                contentPadding = PaddingValues(3.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = ButtonsPay
                ),
                onClick = onClickDec,
                enabled = isEnabled
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.minus),
                    contentDescription = "resta",
                    tint = Color.White,
                    modifier = Modifier.size(15.dp)
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Text(count.toString())

            Spacer(modifier = Modifier.width(16.dp))

            Button(
                modifier = Modifier
                    .width(35.dp)
                    .height(35.dp),
                shape = RoundedCornerShape(5.dp),
                contentPadding = PaddingValues(3.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = ButtonsPay
                ),
                onClick = onClickInc
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.plus),
                    contentDescription = "suma",
                    tint = Color.White,
                    modifier = Modifier.size(15.dp)
                )
            }
        }
    }
}

