package com.example.practica_kt.ui.scripts

import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.runtime.snapshots.SnapshotStateMap


fun CalcularIva(total: Int): Double {
    return total * 0.19
}

fun CalcularSubtotal(total: Int, iva: Double): Double {
    return total - iva
}

fun CalcularTotal(totales: SnapshotStateMap<Int, Int>): Int {
    return totales.values.sum()
}



