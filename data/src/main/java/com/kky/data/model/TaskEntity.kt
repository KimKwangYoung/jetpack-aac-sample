package com.kky.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task")
internal data class TaskEntity(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val title: String,
    val complete: Boolean,
    val memo: String?,
    val createAt: String
)