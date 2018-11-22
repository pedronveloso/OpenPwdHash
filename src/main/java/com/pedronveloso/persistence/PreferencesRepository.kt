package com.pedronveloso.persistence

import com.pedronveloso.persistence.interfaces.PreferencesRepository

/**
 * Contains the user preferences.
 */
class PreferencesRepositoryImpl : PreferencesRepository {

    override fun useDefaultPassword(): Boolean {
        // TODO: change for actual persisted solution
        return true
    }

    override fun defaultPassword(): String {
        // TODO: change for actual persisted solution
        return "12345"
    }

}