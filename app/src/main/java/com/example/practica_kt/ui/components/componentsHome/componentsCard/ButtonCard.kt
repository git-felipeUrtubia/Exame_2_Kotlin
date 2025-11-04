package com.example.practica_kt.ui.components.componentsHome.componentsCard

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.practica_kt.ui.components.componentsHome.GamesSelected


@Composable
fun ButtonCard(onClick: () -> Unit) {
    println("LISTA GLOBAL: ${GamesSelected}")
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(32.dp, 0.dp),
            onClick = onClick
        ) {
            Text("Add")
        }
    }
}
