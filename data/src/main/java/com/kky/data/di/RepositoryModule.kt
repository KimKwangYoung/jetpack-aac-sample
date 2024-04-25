package com.kky.data.di

import com.kky.data.repository.TodoRepositoryImpl
import com.kky.domain.repository.TodoRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindsTodoRepository(impl: TodoRepositoryImpl): TodoRepository
}