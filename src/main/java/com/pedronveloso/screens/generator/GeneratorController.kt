package com.pedronveloso.screens.generator

import com.pedronveloso.errors.GenericResult
import com.pedronveloso.hasher.HashedPassword
import tornadofx.*

class GeneratorController : Controller() {

    fun generateHash(password: String, domain: String): String {
        val hashedPassword = HashedPassword.create(password, domain)
        return hashedPassword.toString()
    }

    fun validateForm(password: String?, domain: String?): GenericResult {
        if (password == null || domain == null) {
            return GenericResult(false, "Fields can't be empty!")
        }
        return GenericResult(true)
    }
}