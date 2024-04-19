package com.kky.domain.repository

interface TodoRepository {
    suspend fun getTodo(tag: String?)
}