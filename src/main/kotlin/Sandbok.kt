import java.util.*

// fizz -> divisible by 3
// buzz -> divisible by 5
// FizzBuzz -> divisible by 3 & 5
fun fizBuzz(num: Int) =
    when {
        num % 15 == 0 ->
            "FizzBuzz "
        num % 3 == 0 ->
            "Fizz "
        num % 5 == 0 ->
            "Buzz "
        else ->
            "$num "
    }

fun iterateOverMap() {
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}

fun runFizBuzz() {
    //    val range = 1..100
    val range = 100 downTo 1 step 2

    for (n in range) {
        print(fizBuzz(n))
    }
}

fun main() {
    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }

    println("Kotlin".last())
}