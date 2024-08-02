package com.jetapps.jettaskboard.mapper

import com.jetapps.jettaskboard.local.entity.CardEntity
import com.jetapps.jettaskboard.model.CardModel
import javax.inject.Inject

class CardMapper @Inject constructor(
    private val labelMapper: LabelMapper,
) : EntityMapper<CardEntity, CardModel> {

    override fun mapToDomain(entity: CardModel): CardEntity {
        return CardEntity(
            entity.id,
            entity.title,
            entity.description,
            entity.coverImageUrl,
            entity.boardId,
            entity.listId,
            entity.authorId,
            entity.startDate,
            entity.dueDate
        )
    }

    override fun mapToData(model: CardEntity): CardModel {
        return CardModel(
            model.id,
            model.title,
            model.description,
            model.coverImageUrl,
            listOf(),
            model.boardId,
            model.listId,
            model.authorId,
            model.startDate,
            model.dueDate
        )
    }
}
