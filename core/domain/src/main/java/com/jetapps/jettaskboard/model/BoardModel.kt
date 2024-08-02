package com.jetapps.jettaskboard.model

data class BoardModel(
    val id: Int? = null,
    val title: String = "",
    val lists: List<ListModel> = emptyList(),
    val isFav: Boolean = false,
)
