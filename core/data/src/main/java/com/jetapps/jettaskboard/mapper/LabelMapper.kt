package com.jetapps.jettaskboard.mapper

import android.graphics.Color
import com.jetapps.jettaskboard.local.entity.LabelEntity
import com.jetapps.jettaskboard.model.LabelModel
import javax.inject.Inject

class LabelMapper @Inject constructor() : EntityMapper<LabelEntity, LabelModel> {
    override fun mapToDomain(entity: LabelModel): LabelEntity {
        return LabelEntity(
            entity.id,
            entity.labelName,
            entity.labelColor.toString()
        )

    }

    override fun mapToData(model: LabelEntity): LabelModel {
        return LabelModel(
            model.id,
            labelName = model.labelName,
            labelColor = Color.parseColor(model.labelColor).toLong()
        )
    }
}