package com.example.kotlin.dataclass

/**
 * @author uncle_yumo
 * @fileName Cellphone
 * @createDate 2024/10/1 October
 * @school 无锡学院
 * @studentID 22344131
 * @description This is a data class for cellphone
 */

data class Cellphone(val brand: String, val price: Double)
//class Cellphone(val brand: String, val price: Double)


fun main() {
    val cellphone1 = Cellphone("Apple", 8999.0)
    val cellphone2 = Cellphone("Samsung", 7999.0)
    println(cellphone1)
    println("Cellphone1 equals Cellphone2 | ${cellphone1 == cellphone2}")
}