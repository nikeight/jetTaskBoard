package com.jetapps.jettaskboard.mapper

import com.jetapps.jettaskboard.local.entity.ListEntity
import com.jetapps.jettaskboard.model.ListModel
import javax.inject.Inject

class ListMapper @Inject constructor(
    private val cardMapper: CardMapper,
) : EntityMapper<ListEntity, ListModel> {
    override fun mapToDomain(entity: ListModel): ListEntity {
        return ListEntity(
            listId = entity.id,
            title = entity.title,
            boardId = entity.id,
        )
    }

    override fun mapToData(model: ListEntity): ListModel {
        return ListModel(
            id = model.listId,
            title = model.title,
        )
    }
}