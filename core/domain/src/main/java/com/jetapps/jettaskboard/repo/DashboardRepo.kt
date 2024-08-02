package com.jetapps.jettaskboard.repo

import com.jetapps.jettaskboard.model.BoardModel
import com.jetapps.jettaskboard.model.ProfileModel
import kotlinx.coroutines.flow.Flow

interface DashboardRepo {
    suspend fun fetchAllBoards() : Flow<List<BoardModel>>
    suspend fun fetchProfile() : ProfileModel
}