package com.jetapps.jettaskboard.repo

import com.jetapps.jettaskboard.local.datastore.PreferenceDataStoreSource
import com.jetapps.jettaskboard.local.source.DatabaseSource
import com.jetapps.jettaskboard.mapper.BoardMapper
import com.jetapps.jettaskboard.mapper.CardMapper
import com.jetapps.jettaskboard.mapper.LabelMapper
import com.jetapps.jettaskboard.mapper.ListMapper
import com.jetapps.jettaskboard.model.BoardModel
import com.jetapps.jettaskboard.model.CardModel
import com.jetapps.jettaskboard.model.ListModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class BoardRepoImpl @Inject constructor(
    private val preferenceDataStoreSource: PreferenceDataStoreSource,
    private val databaseSource: DatabaseSource,
    private val boardMapper: BoardMapper,
    private val listMapper: ListMapper,
    private val cardMapper: CardMapper,
) : BoardRepo {

    override suspend fun getLatestBackgroundImgUri(): Flow<String?> {
        return preferenceDataStoreSource.getLatestBackgroundImgUri()
    }

    override suspend fun updateBackgroundImgUri(string: String) {
        preferenceDataStoreSource.updateBackgroundImgUri(string)
    }

    override suspend fun getBoardDetails(boardId: String): Flow<BoardModel> {
//        return databaseSource.getBoard(boardId).map {
//            boardMapper.mapToData(it)
//        }
        return flow {

        }
    }

    override suspend fun createNewList(listModel: ListModel) {
        databaseSource.createNewList(listMapper.mapToDomain(listModel))
    }

    override suspend fun deleteList(listModel: ListModel) {
        databaseSource.deleteList(listMapper.mapToDomain(listModel))
    }

    override suspend fun updateCard(cardModel: CardModel) {
        databaseSource.updateCard(cardMapper.mapToDomain(cardModel))
    }

    override suspend fun deleteCard(cardModel: CardModel) {
        databaseSource.deleteCard(cardMapper.mapToDomain(cardModel))
    }

    override suspend fun createCard(cardModel: CardModel) {
        databaseSource.createCard(cardMapper.mapToDomain(cardModel))
    }
}