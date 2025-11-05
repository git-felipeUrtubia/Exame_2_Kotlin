package com.example.practica_kt.ui.scripts

import java.text.NumberFormat
import java.util.Locale

fun formatNumberToCLP(precio: Int): String {
    val formato = NumberFormat.getInstance(Locale("es", "CL"))
    return formato.format(precio)
}