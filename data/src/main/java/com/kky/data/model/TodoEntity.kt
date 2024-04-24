package com.kky.data.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Junction
import androidx.room.PrimaryKey
import androidx.room.Relation

@Entity(primaryKeys = ["id", "name"])
internal data class TodoCrossRef(
    val id: Int,
    val name: String
)
@Entity
internal data class TodoEntity(
    @Embedded val task: TaskEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "name",
        associateBy = Junction(TodoCrossRef::class)
    )
    val tag: List<TagEntity>
)
