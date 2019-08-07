package classes

interface SomeService {
    val seed: Int
    fun serve(action: (Int) -> Unit)
}

class ServiceImpl : SomeService {
    override val seed: Int = 1

    override fun serve(action: (Int) -> Unit) {
        action(seed)
    }
}

class SomeServiceImpl : SomeService {
    override val seed: Int = 99

    override fun serve(action: (Int) -> Unit) {
        action(seed)
    }

}

class ServiceDecorator : SomeService by SomeServiceImpl() {
    override val seed = 2
}

fun main() {
    val service = ServiceDecorator()
    service.serve {
        println(it)
    }
}