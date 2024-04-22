package com.kky.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TodoEntity(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val title: String,
    val tag: List<String>,
    val memo: String?,
    val complete: Boolean
)
