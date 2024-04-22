package com.kky.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.kky.data.model.TodoEntity

@Database(entities = [TodoEntity::class], version = 1)
internal abstract class AppDatabase: RoomDatabase() {
    abstract fun dao(): AppDatabaseDao

    companion object {
        @Volatile
        var sInstance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return sInstance ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).build()

                sInstance = instance

                instance
            }
        }
    }
}