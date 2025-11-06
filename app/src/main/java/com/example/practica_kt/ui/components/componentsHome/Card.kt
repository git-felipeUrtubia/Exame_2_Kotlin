package com.example.practica_kt.ui.components.componentsHome

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.practica_kt.ui.components.componentsHome.componentsCard.ButtonCard
import com.example.practica_kt.ui.components.componentsHome.componentsCard.CatCard
import com.example.practica_kt.ui.components.componentsHome.componentsCard.DescCard
import com.example.practica_kt.ui.components.componentsHome.componentsCard.ImageCard
import com.example.practica_kt.ui.components.componentsHome.componentsCard.PrecioCard
import com.example.practica_kt.ui.components.componentsHome.componentsCard.TitleCard
import com.example.practica_kt.ui.scripts.GameItem
import com.example.practica_kt.ui.scripts.ReadJson
import com.example.practica_kt.ui.scripts.getDrawableId
import com.example.practica_kt.ui.scripts.parseJsonToList
import com.example.practica_kt.ui.theme.CardBackground

var GamesSelected = mutableStateListOf<Int>()
@Composable
fun CardList(exportChangeVisible: (Boolean) -> Unit) {
    var isVisible by remember { mutableStateOf(if (GamesSelected.isEmpty()) false else true) }

    val context = LocalContext.current
    val json = ReadJson(context)
    val list = parseJsonToList(json)


    LazyVerticalGrid (
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),

        modifier = Modifier
            .fillMaxSize()
            .height(300.dp)
            .padding(16.dp, 8.dp, 16.dp, 8.dp)
    ) {
        items(list) { index ->


            CustomCard(
                index,
                context,
                isVisible,
                exportChangeVisible = { isVisible ->
                    exportChangeVisible(isVisible)
                    println("VISIBLE (CardList): $isVisible")
                },
                onChangeIsVisible = { newIsVisible ->
                    isVisible = newIsVisible
                }
            )
            Spacer(modifier = Modifier.height(16.dp))
        }

    }
}
@Composable
fun CustomCard(
    index: GameItem,
    context: Context,
    isVisible: Boolean,
    exportChangeVisible: (Boolean) -> Unit,
    onChangeIsVisible: (Boolean) -> Unit
) {


    val poster = getDrawableId(context, index.poster)
    val title = index.title
    val desc = index.desc


    LaunchedEffect(isVisible) {
        exportChangeVisible(isVisible)
    }



    println("VISIBLE (CustomCard): $isVisible")
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .background(Color.Transparent)
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .background(CardBackground),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            ImageCard(poster)
            TitleCard(title)
            CatCard(index.categoria)
            PrecioCard(index.precio)
            ButtonCard(
                onClick = { GamesSelected.add(index.id) },
                onChangeIsVisible = { onChangeIsVisible(true) }
            )
        }
    }
}
