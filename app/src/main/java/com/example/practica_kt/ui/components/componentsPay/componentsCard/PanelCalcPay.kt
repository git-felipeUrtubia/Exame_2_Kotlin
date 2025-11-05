package com.example.practica_kt.ui.components.componentsPay.componentsCard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.practica_kt.ui.scripts.formatNumberToCLP


@Composable
fun PanelCalcPay(total: Int, iva: Int, subtotal: Int) {

    val totalFormatCLP = formatNumberToCLP(total)
    val ivaFormatCLP = formatNumberToCLP(iva)
    val subtotalFormatCLP = formatNumberToCLP(subtotal)


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly
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
    }
}

