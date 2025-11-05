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
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.practica_kt.ui.components.componentsHome.componentsCard.ButtonCard
import com.example.practica_kt.ui.components.componentsHome.componentsCard.DescCard
import com.example.practica_kt.ui.components.componentsHome.componentsCard.ImageCard
import com.example.practica_kt.ui.components.componentsHome.componentsCard.PrecioCard
import com.example.practica_kt.ui.components.componentsHome.componentsCard.TitleCard
import com.example.practica_kt.ui.scripts.GameItem
import com.example.practica_kt.ui.scripts.ReadJson
import com.example.practica_kt.ui.scripts.getDrawableId
import com.example.practica_kt.ui.scripts.parseJsonToList
import com.example.practica_kt.ui.theme.CardBackground

var GamesSelected = mutableListOf<Int>()
@Composable
fun CardList() {

    val context = LocalContext.current
    val json = ReadJson(context)
    val list = parseJsonToList(json)


    LazyColumn (
        modifier = Modifier
            .fillMaxSize()
            .height(300.dp)
            .padding(16.dp, 8.dp, 16.dp, 8.dp)
    ) {
        items(list) { index ->
            CustomCard(index, context)
            Spacer(modifier = Modifier.height(16.dp))
        }

    }
}
@Composable
fun CustomCard(index: GameItem, context: Context) {

    val poster = getDrawableId(context, index.poster)
    val title = index.title
    val desc = index.desc

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(450.dp)
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
            DescCard(desc)
            PrecioCard(index.precio)
            ButtonCard(onClick = {
                GamesSelected.add(index.id)
            })
        }
    }
}
