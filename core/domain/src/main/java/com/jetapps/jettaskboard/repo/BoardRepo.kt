package com.jetapps.jettaskboard.repo

import com.jetapps.jettaskboard.model.BoardModel
import com.jetapps.jettaskboard.model.CardModel
import com.jetapps.jettaskboard.model.ListModel
import kotlinx.coroutines.flow.Flow

interface BoardRepo {
    suspend fun getLatestBackgroundImgUri(): Flow<String?>
    suspend fun updateBackgroundImgUri(string: String)
    suspend fun getBoardDetails(boardId : String) : Flow<BoardModel>
    suspend fun createNewList(listModel: ListModel)
    suspend fun deleteList(listModel: ListModel)
    suspend fun updateCard(cardModel: CardModel)
    suspend fun deleteCard(cardModel: CardModel)
    suspend fun createCard(cardModel: CardModel)
}