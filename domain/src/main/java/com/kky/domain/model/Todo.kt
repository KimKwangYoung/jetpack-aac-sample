package com.kky.domain.model

data class Todo(
    val id: Long,
    val title: String,
    val tag: List<String>,
    val memo: String?,
    val complete: Boolean
)
