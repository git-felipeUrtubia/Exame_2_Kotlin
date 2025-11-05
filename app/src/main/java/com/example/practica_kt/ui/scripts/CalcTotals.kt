package com.example.practica_kt.ui.scripts

import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.runtime.snapshots.SnapshotStateMap


fun CalcularIva(total: Int): Int {
    return total * 19 / 100
}

fun CalcularSubtotal(total: Int, iva: Int): Int {
    return total - iva
}

fun CalcularTotal(totales: SnapshotStateMap<Int, Int>): Int {
    return totales.values.sum()
}



