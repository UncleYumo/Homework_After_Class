package com.example.kotlin.basic_grammer

/**
 * @author uncle_yumo
 * @fileName Person
 * @createDate 2024/9/30 September
 * @school 无锡学院
 * @studentID 22344131
 * @description
 */

open class Person(val name: String, val age: Int) {
    init {
        println("Person | init{}")
        println("Name is $name, Age is $age")
    }

    constructor() : this("Uncle Yumo", 25) {
        println("Person | constructor()")
        println("Name is $name, Age is $age")
    }

    open fun method() {
        println("Person | method()")
    }
}