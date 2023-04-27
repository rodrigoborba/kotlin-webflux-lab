package com.borba.reactive.model

data class Indication (
    val name: String,
    var books: Set<Book>?
)