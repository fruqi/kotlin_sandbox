package collections

//fun <T> joinToString(
//    collection: List<T>,
//    suffix: String = "(",
//    delimiter: String = ";",
//    postfix: String = ")"
//): String {
//    val stringBuilder = StringBuilder(suffix)
//
//    for ((index, element) in collection.withIndex()) {
//        if (index > 0) stringBuilder.append(delimiter)
//        stringBuilder.append(element)
//    }
//
//    stringBuilder.append(postfix)
//    return stringBuilder.toString()
//}

fun <T> Collection<T>.combineToString(suffix: String = "(", delimiter: String = ";", postfix: String = ")"): String {
    val stringBuilder = StringBuilder(suffix)

    this.forEachIndexed { index, el ->
        if (index > 0) stringBuilder.append(delimiter)
        stringBuilder.append(el)
    }

    stringBuilder.append(postfix)

    return stringBuilder.toString()
}

fun Collection<String>.join(suffix: String = "", delimiter: String = ", ", postfix: String = ""): String =
    this.combineToString(suffix, delimiter, postfix)

fun main() {
    val list = listOf(1, 2, 3, 4)
    println(list.combineToString())

    val strList = listOf("one", "two", "ten")
    println(strList.join(delimiter = "-"))
}