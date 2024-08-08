package com.jetapps.jettaskboard.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "listTable",
)
data class ListEntity(
    @PrimaryKey val listId: String,
    val title: String,
    val boardId: String
)
