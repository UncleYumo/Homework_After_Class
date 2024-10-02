package com.example.kotlin.basic_grammer

/**
 * @author uncle_yumo
 * @fileName Study
 * @createDate 2024/10/1 October
 * @school 无锡学院
 * @studentID 22344131
 * @description
 */

interface Study {
    fun readBooks()
    fun doHomework()
    fun doHomeworkDefault() {
        println("Doing homework | Default implementation")
    }
}