package strings

//fun String.lastChar(): Char = this[this.length - 1]

val String.lastChar: Char
    get() = get(length - 1)


var StringBuilder.lastChar: Char
    get() = this.get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main() {
    val str = "Kotlin"
    println(str.lastChar)

    val strBld = StringBuilder("Kotlin?")
    strBld.lastChar = '!'

    println(strBld.toString())
}