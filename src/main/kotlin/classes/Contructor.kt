package classes

//class User(val name: String)

//class User constructor(_name: String) {
//    val name: String
//
//    init {
//        name = _name
//    }
//}

//class User(_name: String) {
//    val name = _name
//}

//class User private constructor(_name: String) {
//    val name = _name
//
//}

//class User(var name: String)

open class User(val nickname: String)

class TwitterUser(nickname: String) : User(nickname)

fun main() {
    val user = TwitterUser("fruqi")
}