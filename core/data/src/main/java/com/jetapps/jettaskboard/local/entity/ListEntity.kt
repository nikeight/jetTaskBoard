package com.jetapps.jettaskboard.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "listTable",
)
data class ListEntity(
    @PrimaryKey
    val listId: Int,
    val title: String,
    val boardId: Int
)
