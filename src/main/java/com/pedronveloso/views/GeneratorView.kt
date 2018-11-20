package com.pedronveloso.views

import tornadofx.View
import tornadofx.button
import tornadofx.label
import tornadofx.vbox

class GeneratorView: View() {
    override val root = vbox {
        button("Press me")
        label("Waiting")
    }
}