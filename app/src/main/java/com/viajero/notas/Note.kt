package com.viajero.notas

data class Note(
    val id: String,
    val title:String,
    val description: String,
    val favorite: Boolean
) {
}