package com.example.practica_kt.ui.components.componentsPay

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.practica_kt.ui.components.componentsHome.GamesSelected
import com.example.practica_kt.ui.components.componentsPay.componentsCard.ButtonDeletePay
import com.example.practica_kt.ui.components.componentsPay.componentsCard.CantPay
import com.example.practica_kt.ui.components.componentsPay.componentsCard.PanelCalcPay
import com.example.practica_kt.ui.components.componentsPay.componentsCard.PrecioPay
import com.example.practica_kt.ui.components.componentsPay.componentsCard.TitlePay
import com.example.practica_kt.ui.components.exception.NullOrEmpty
import com.example.practica_kt.ui.scripts.CalcularIva
import com.example.practica_kt.ui.scripts.CalcularSubtotal
import com.example.practica_kt.ui.scripts.CalcularTotal
import com.example.practica_kt.ui.scripts.GameItem
import com.example.practica_kt.ui.scripts.ReadJson
import com.example.practica_kt.ui.scripts.parseJsonToList
import kotlin.collections.getValue


@Composable
fun CardProdsSelected() {

    val context = LocalContext.current
    val json = ReadJson(context)
    val list = parseJsonToList(json)

    val games = remember { mutableStateListOf<GameItem>() }
    val totales = remember { mutableStateMapOf<Int, Int>() }
    var iva by remember { mutableIntStateOf(0) }
    var subtotal by remember { mutableIntStateOf(0) }
    var total by remember { mutableIntStateOf(0) }


    LaunchedEffect(GamesSelected) {
        list.forEach { item ->
            for (id in GamesSelected.distinct()) {
                if (id == item.id) {
                    games.add(item)
                }
            }
        }
    }

    if (games.isEmpty()) {
        NullOrEmpty("productos no existen, por favor agrega al menos uno.")
    }else {
        LazyColumn (
            modifier = Modifier
                .height(530.dp)
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFF0F2027),
                            Color(0xFF203A43),
                            Color(0xFF2C5364)
                        )
                    )
                )
        ) {
            items(games) { index ->

                CustomCardProdsSelected(
                    index,
                    onClick = {
                        games.remove(index)
                        GamesSelected.remove(index.id)
                        totales.remove(index.id)
                    },
                    exportPrecio = {
                        total -> totales[index.id] = total
                    }
                )

                Spacer(modifier = Modifier.height(16.dp))
            }
        }

        println(totales)
        total = CalcularTotal(totales)
        iva = CalcularIva(total)
        subtotal = CalcularSubtotal(total, iva)



        Column(
            modifier = Modifier.fillMaxWidth()

        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)
                    .background(Color.White)
            ) {
                Box(
                    modifier = Modifier.fillMaxSize()
                ) {
                    PanelCalcPay(total, iva, subtotal)
                }
            }
        }
    }


}
@Composable
fun CustomCardProdsSelected(index: GameItem, onClick: () -> Unit, exportPrecio: (Int) -> Unit) {

    var count by remember { mutableIntStateOf(1) }
    var isEnabled by remember { mutableStateOf(true) }

    LaunchedEffect(count) {
        exportPrecio(index.precio * count)
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TitlePay(index.title)

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                PrecioPay(if(count > 0) index.precio * count else index.precio)
                ButtonDeletePay(onClick = onClick)
            }

            CantPay(
                count,
                onClickInc = {
                    if(count >= 1) {
                        count += 1
                        isEnabled = true
                    }
                },
                onClickDec = {
                    if(count > 1) {
                        count -= 1
                    } else {
                        count = 1
                        isEnabled = false
                    }
                },
                isEnabled
            )
        }
    }
}



