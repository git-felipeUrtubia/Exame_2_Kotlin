package com.example.practica_kt.ui.scripts

import android.content.Context
import com.example.practica_kt.R


fun ReadJson(context: Context): String {
    return context.resources.openRawResource(R.raw.games)
        .bufferedReader()
        .use { it.readText() }
}

