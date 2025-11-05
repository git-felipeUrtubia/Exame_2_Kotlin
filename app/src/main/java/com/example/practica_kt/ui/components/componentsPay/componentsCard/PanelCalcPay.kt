package com.example.practica_kt.ui.components.componentsPay.componentsCard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practica_kt.R
import com.example.practica_kt.ui.scripts.formatNumberToCLP


@Composable
fun PanelCalcPay(total: Int, iva: Int, subtotal: Int) {

    val totalFormatCLP = formatNumberToCLP(total)
    val ivaFormatCLP = formatNumberToCLP(iva)
    val subtotalFormatCLP = formatNumberToCLP(subtotal)


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "El IVA viene incluido en el precio",
                fontWeight = FontWeight.Bold
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Iva:",
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "$$ivaFormatCLP",
                fontWeight = FontWeight.Bold
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "SubTotal:",
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "$$subtotalFormatCLP",
                fontWeight = FontWeight.Bold
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Total:",
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "$$totalFormatCLP",
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(32.dp, 0.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF1E40AF)
            ),
            contentPadding = PaddingValues(16.dp, 8.dp),
            onClick = { println("Hola Mundo") }
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Pagar",
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.width(8.dp))

                Icon(
                    painter = painterResource(id = R.drawable.hand_coins),
                    contentDescription = "pay",
                    tint = Color.White,
                    modifier = Modifier.size(25.dp)
                )
            }
        }
    }
}

