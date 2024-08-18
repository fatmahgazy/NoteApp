package org.codeforegypt.cleanarchitcturenoteapp.feature_note.peresentation.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}