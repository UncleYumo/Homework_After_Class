package com.example.kotlin.funAPI

import com.review.programming.progrom.Color_Print_Utils

/**
 * @author uncle_yumo
 * @fileName TempKT
 * @createDate 2024/10/1 October
 * @school 无锡学院
 * @studentID 22344131
 * @description
 */

class TempKT : Runnable{
    override fun run() {
        for (i in 1..10) {
            Thread.sleep(300)
            Color_Print_Utils.getInstance().printlnCyan("Thread is Running")
        }
    }
}

fun main() {
    Thread(TempKT()).start()
    Thread {
        for (i in 1..10) {
            Thread.sleep(300)
            Color_Print_Utils.getInstance().printlnBlue("Thread is Running")
        }
    }.start()

    Thread {
        for (i in 1..10) {
            Thread.sleep(300)
            Color_Print_Utils.getInstance().printlnPurple("Thread is Running")
        }
    }.start()
}