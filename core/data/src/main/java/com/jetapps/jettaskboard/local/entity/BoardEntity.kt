package com.jetapps.jettaskboard.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "boardTable"
)
data class BoardEntity(
    @PrimaryKey val boardId: String,
    val title: String,
    val description: String,
    val isFav : Int
)
