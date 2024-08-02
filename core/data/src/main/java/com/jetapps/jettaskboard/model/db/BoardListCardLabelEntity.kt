package com.jetapps.jettaskboard.model.db

import com.jetapps.jettaskboard.local.entity.BoardEntity
import com.jetapps.jettaskboard.local.entity.CardEntity
import com.jetapps.jettaskboard.local.entity.LabelEntity
import com.jetapps.jettaskboard.local.entity.ListEntity
import com.jetapps.jettaskboard.model.ListModel

data class BoardWithListEntity(
    val boardEntity: BoardEntity,
    val boardList : List<ListWithCardEntity>
)

data class ListWithCardEntity(
    val columnList : ListEntity,
    val cardList : List<CardEntity>
)

data class CardWithLabelEntity(
    val id : String,
    val labelList : List<LabelEntity>
)