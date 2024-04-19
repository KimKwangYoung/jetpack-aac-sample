package com.kky.data.model

data class TodoEntity(
    val id: Long,
    val title: String,
    val tag: List<String>,
    val memo: String?,
    val complete: Boolean
)
