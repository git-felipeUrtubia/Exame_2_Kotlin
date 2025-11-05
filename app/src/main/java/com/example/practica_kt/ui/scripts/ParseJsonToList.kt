package com.example.practica_kt.ui.scripts

import org.json.JSONArray

data class GameItem(
    val id: Int,
    val title: String,
    val desc: String,
    val poster: String,
    val precio: Int,
    val categoria: String
)

fun parseJsonToList(json: String): List<GameItem> {
    val jsonArray = JSONArray(json)
    val list = mutableListOf<GameItem>()

    for (i in 0 until jsonArray.length()) {
        val obj = jsonArray.getJSONObject(i)
        list.add(
            GameItem(
                id = obj.getInt("id"),
                title = obj.getString("title"),
                desc = obj.getString("desc"),
                poster = obj.getString("poster"),
                precio = obj.getInt("precio"),
                categoria = obj.getString("categoria")
            )
        )
    }

    return list
}

