package com.jetapps.jettaskboard.local.source

import com.jetapps.jettaskboard.local.entity.BoardEntity
import com.jetapps.jettaskboard.local.entity.CardEntity
import com.jetapps.jettaskboard.local.entity.LabelEntity
import com.jetapps.jettaskboard.local.entity.ListEntity
import com.jetapps.jettaskboard.model.db.BoardWithListEntity
import kotlinx.coroutines.flow.Flow

interface DatabaseSource {
    suspend fun getBoard(boardId : String) : Flow<BoardWithListEntity>
    suspend fun getBoards() : Flow<List<BoardEntity>>
    suspend fun updateCard(cardEntity: CardEntity)
    suspend fun createCard(cardEntity: CardEntity)
    suspend fun deleteCard(cardEntity: CardEntity)
    suspend fun createNewList(listEntity: ListEntity)
    suspend fun deleteList(listEntity: ListEntity)
    suspend fun createLabel(labelEntity: LabelEntity)
    suspend fun deleteLabel(labelEntity: LabelEntity)
}