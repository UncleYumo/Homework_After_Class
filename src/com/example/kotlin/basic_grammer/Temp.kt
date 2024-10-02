package com.example.kotlin.basic_grammer

/**
 * @author uncle_yumo
 * @fileName Temp
 * @createDate 2024/10/1 October
 * @school 无锡学院
 * @studentID 22344131
 * @description
 */

fun main() {
    val temp = Temp()
    temp.print()
}

class Temp {
    private var a: Int = 0
        get() {
            println("get方法的结构体: ")
            return field + 5
        }
        set(value) {
            println("set方法的结构体: ")
            field = value - 5
        }

    init {
        println("主构造函数的结构体: ")
        a = 5
        println("a = $a")
    }

    fun print() {
        println("a = $a")
    }
}