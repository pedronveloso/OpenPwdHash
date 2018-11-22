package com.pedronveloso.screens.generator

import com.pedronveloso.persistence.PreferencesRepositoryImpl
import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class GeneratorView : View() {

    private val controller: GeneratorController by inject()
    private val domainInput = SimpleStringProperty()
    private val passwordInput = SimpleStringProperty()

    override val root = form {
        fieldset {
            val resultLabel = label("No result yet")
            textfield(domainInput)
            passwordfield(passwordInput)


            button("Generate") {
                action {
                    val formValidity = controller.validateForm(passwordInput.value, domainInput.value)
                    if (formValidity.successful) {
                        val hash = controller.generateHash(passwordInput.value, domainInput.value)
                        resultLabel.text = hash
                    } else {
                        // TODO: Make error messages display differently.
                        resultLabel.text = formValidity.reason
                    }
                }
            }
        }

        // After declaring, initialize UI based on preferences and such.
        initUI()

    }

    private fun initUI() {
        super.onCreate()
        val prefs = PreferencesRepositoryImpl()
        if (prefs.useDefaultPassword()) {
            passwordInput.value = prefs.defaultPassword()
        }
    }


}