package com.jetapps.jettaskboard.model.db

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Junction
import androidx.room.Relation
import com.jetapps.jettaskboard.local.entity.BoardEntity
import com.jetapps.jettaskboard.local.entity.CardEntity
import com.jetapps.jettaskboard.local.entity.LabelEntity
import com.jetapps.jettaskboard.local.entity.ListEntity

data class BoardWithLists(
    @Embedded val boardEntity: BoardEntity,
    @Relation(
        entity = ListEntity::class,
        parentColumn = "boardId",
        entityColumn = "boardId",
    )
    val boardList: List<ListWithCards>
)

data class ListWithCards(
    @Embedded val columnList: ListEntity,
    @Relation(
        parentColumn = "listId",
        entityColumn = "listId",
        associateBy = Junction(ListWithCardEntity::class)
    )
    val cardList: List<CardEntity>
)

data class CardWithLabelEntity(
    val id: String,
    val labelList: List<LabelEntity>
)

@Entity(primaryKeys = ["listId,cardId"])
data class ListWithCardEntity(
    val listId: String,
    val cardId: String,
)