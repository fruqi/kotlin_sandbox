package coroutines

import kotlinx.coroutines.*
import java.time.Duration
import java.time.Instant


//fun main() {
//    GlobalScope.launch {
//        delay(1000L)
//        println("World!")
//    }
//
//    println("Hello")

//    Thread.sleep(2000L)

//    runBlocking {
//        delay(2000L)
//    }
//}

//fun main() = runBlocking<Unit> {
//    GlobalScope.launch {
//        delay(1000L)
//        println("World!")
//    }
//
//    println("Hello, ")
//    delay(2000L)
//}

//fun main() = runBlocking {
//    val job = GlobalScope.launch {
//        delay(1000L)
//        println("World!")
//    }
//
//    println("Hello")
//    job.join()
//}

//fun main() = runBlocking {
//    launch {
//        delay(1000L)
//        println("World!")
//    }
//
//    println("Hello,")
//}

//fun main() = runBlocking {
//    launch {
//        delay(200)
//        println("Task from runBlocking")
//    }
//
//    coroutineScope {
//        launch {
//            delay(500)
//            println("Task from nested launch")
//        }
//
//        delay(100)
//        println("Task from coroutine scope")
//    }
//
//    println("Coroutine scope is over")
//}

//fun someOp() = runBlocking {
//}

//fun main() = runBlocking {
//    launch { doWorld() }
//    println("Hello,")
//}

//suspend fun doWorld() {
//    coroutineScope {
//        launch {
//            delay(100)
//            println("nested")
//        }
//
//        delay(300)
//        println("Coroutine scope")
//    }
//
//    delay(2000)
//    println("world")
//}

//suspend fun doWorld() {
//    delay(1000L)
//    println("World!")
//}

//suspend fun main() = coroutineScope {
//    launch { doWorld() }
//    println("Hello,")
//}

fun mainb() = runBlocking {
    println("Start")

    launch {
        val begin = Instant.now()

        repeat(100_000) {
            //            delay(1000)
            print(".")
        }

        val end = Instant.now()
        val elapsed = Duration.between(begin, end)
        println("Time taken: $elapsed")
    }

    println("Finished")
}

fun main() = runBlocking {

    val result = async {
        delay(5000)
        "hello"
    }

    println(result.await())
    println(result.await())

}

suspend fun mainc() = coroutineScope {
    println("Start")
    launch {
        val begin = Instant.now()

        repeat(100_000) {
                //            delay(1000)
                print(".")
        }

        val end = Instant.now()
        val elapsed = Duration.between(begin, end)
        println("Time taken: $elapsed")
    }

    println("Finished")
}

//suspend fun main() = coroutineScope {
//    val begin = Instant.now()
//
//    repeat(100_000) {
//        launch {
////            delay(1000)
//            print(".")
//        }
//    }
//
//    val end = Instant.now()
//    val elapsed = Duration.between(begin, end)
//    println("Time taken: $elapsed")
//}

fun maini() = runBlocking {
    val begin = Instant.now()

    repeat(100_000) {
        launch {
//            delay(1000)
            print(".")
        }
    }

    val end = Instant.now()
    val elapsed = Duration.between(begin, end)
    println("Time taken: $elapsed")
}
