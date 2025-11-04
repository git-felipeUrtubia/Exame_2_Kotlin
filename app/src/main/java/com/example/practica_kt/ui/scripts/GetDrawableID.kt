package com.example.practica_kt.ui.scripts

import android.content.Context


fun getDrawableId(context: Context, name: String): Int {
    return context.resources.getIdentifier(name, "drawable", context.packageName)
}



