package com.example.kotlin.dataclass

import com.review.programming.progrom.Color_Print_Utils
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

/**
 * @author uncle_yumo
 * @fileName Fruit
 * @createDate 2024/10/1 October
 * @school 无锡学院
 * @studentID 22344131
 * @description To study the data class in Kotlin, we can create a class named Fruit with a list of fruits.
 */

data class Fruit(val list: ArrayList<String>) {
    constructor() : this(ArrayList()) {
        list.add("apple")
        list.add("banana")
        list.add("orange")
        list.add("grape")
        list.add("pear")
    }
    val listPlus = listOf("Apple", "Banana", "Orange", "Grape", "Pear")
    val listMutable = mutableListOf(1, 3, 5, 7, 9, 11, 13, 15, 17, 19)
    val map = HashMap<String, Int>()
    val mapPlus = mapOf("apple" to 10, "banana" to 20, "orange" to 30, "grape" to 40, "pear" to 50)
}

fun main() {

//    val list = Fruit().listPlus
//    val lambda = { fruit: String -> fruit.length }
//    val maxLengthFruit = list.maxBy(lambda)
//    println(maxLengthFruit)

//    val list = Fruit().listPlus
//    val maxLengthFruit = list.maxBy { it.length }
//    println(maxLengthFruit)

//    val list = Fruit().listPlus
//    val newList = list.filter { it.length <= 5 }.map { it.toUpperCase() }
//    newList.forEach(::println)

    val list = Fruit().listPlus
    val anyResult = list.any { it.length < 5 }
    val allResult = list.any { it == "Hello World" }
    Color_Print_Utils.getInstance().printlnCyan(
        "anyResult | $anyResult${"\n"}allResult | $allResult"
    )
}