package com.jetapps.jettaskboard.local.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.jetapps.jettaskboard.local.entity.CardEntity
import com.jetapps.jettaskboard.local.entity.ListEntity
import com.jetapps.jettaskboard.model.db.BoardWithListEntity

@Dao
interface BoardDao {
    @Transaction
    @Query("SELECT * FROM boardTable WHERE id = :boardId")
    fun getBoardWithListsAndCards(boardId: Int): BoardWithListEntity

    @Query("SELECT * FROM listTable WHERE id = :boardId")
    fun getListsByBoardId(boardId: Int): List<ListEntity>

    @Query("SELECT * FROM cardTable WHERE id = :listId")
    fun getCardsByListId(listId: Int): List<CardEntity>
}