package org.gloot.sdk

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

expect fun platformName(): String

fun createApplicationScreenMessage() : String {
    return "Kotlin Rocks on ${platformName()}"
}

fun AnimalTest(test: Test){
    GlobalScope.launch {
        delay(1000)
        println("Hello from Kotlin Coroutines!")
    }
    println(test.name)
}

enum class Test{
    HORSE,
    RABBIT
}