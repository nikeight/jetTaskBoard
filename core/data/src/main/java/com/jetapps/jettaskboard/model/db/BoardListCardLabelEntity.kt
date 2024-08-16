package com.jetapps.jettaskboard.model.db

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Junction
import androidx.room.Relation
import com.jetapps.jettaskboard.local.entity.BoardEntity
import com.jetapps.jettaskboard.local.entity.CardEntity
import com.jetapps.jettaskboard.local.entity.LabelEntity
import com.jetapps.jettaskboard.local.entity.ListEntity

@Entity(primaryKeys = ["listId", "cardId"])
data class ListWithCardCrossRef(
    val listId: Int,
    val cardId: Int,
)

data class BoardWithLists(
    @Embedded val boardEntity: BoardEntity,
    @Relation(
        entity = ListEntity::class,
        parentColumn = "boardId",
        entityColumn = "boardId",
    )
    val boardList: List<ListWithCards> = emptyList()
)

data class ListWithCards(
    @Embedded val columnList: ListEntity,
    @Relation(
        parentColumn = "listId",
        entityColumn = "listId",
        associateBy = Junction(ListWithCardCrossRef::class)
    )
    val cardList: List<CardEntity> = emptyList()
)