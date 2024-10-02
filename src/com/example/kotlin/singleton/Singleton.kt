package com.example.kotlin.singleton

/**
 * @author uncle_yumo
 * @fileName Singleton
 * @createDate 2024/10/1 October
 * @school 无锡学院
 * @studentID 22344131
 * @description Singleton pattern in Kotlin
 */

object Singleton {  // object keyword creates a singleton instance
    fun singletonTest() {
        println("Singleton | singletonTest | called")
    }
}

fun main() {
    Singleton.singletonTest()
}