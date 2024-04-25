package com.kky.data.mapper

import com.kky.data.model.TodoEntity
import com.kky.domain.model.Todo

internal object DataToDomainMapper {
    fun todoToDomain(entity: TodoEntity): Todo {
        return Todo(
            id = entity.task.id,
            title = entity.task.title,
            memo = entity.task.memo,
            tag = entity.tag.map { it.name },
            complete = entity.task.complete
        )
    }
}