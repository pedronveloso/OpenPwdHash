package com.pedronveloso.persistence.interfaces

interface PreferencesRepository {

    fun useDefaultPassword(): Boolean

    fun defaultPassword(): String
}