package com.kky.data.local

import androidx.room.Dao
import androidx.room.Query
import com.kky.data.model.TodoEntity

@Dao
internal interface AppDatabaseDao {
    @Query("SELECT * FROM TodoEntity")
    suspend fun getAllTodoList(): List<TodoEntity>

    @Query("SELECT * FROM TodoEntity WHERE :tag = tag")
    suspend fun getTodoByTag(tag: String): List<TodoEntity>
}