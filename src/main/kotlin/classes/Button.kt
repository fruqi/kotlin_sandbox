package classes

import java.io.Serializable

/**
 * Inner & nested classes implementation in Kotlin
 */

interface State : Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) { /* */ }
}

class Button : View {
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {
        println("Restore state operation")
    }

    class ButtonState : State
}

fun main() {
    println("has no output")
}