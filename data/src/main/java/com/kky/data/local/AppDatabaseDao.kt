package com.kky.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.kky.data.model.TagEntity
import com.kky.data.model.TaskEntity
import com.kky.data.model.TodoEntity
import com.kky.domain.model.Todo
import kotlinx.coroutines.flow.Flow

@Dao
internal interface AppDatabaseDao {
    @Query("SELECT * FROM TodoEntity")
    suspend fun getAllTodoList(): Flow<List<TodoEntity>>

    @Query("SELECT * FROM TodoEntity WHERE :tag = tag")
    suspend fun getTodoByTag(tag: String): Flow<List<TodoEntity>>

    @Insert
    suspend fun insertTask(taskEntity: TaskEntity)

    @Delete
    suspend fun deleteTask(todo: TaskEntity)
    @Insert
    suspend fun insertTag(tag: TagEntity)

    @Delete
    suspend fun deleteTag(tag: TagEntity)

}