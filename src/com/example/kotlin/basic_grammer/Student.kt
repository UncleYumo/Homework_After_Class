package com.example.kotlin.basic_grammer

/**
 * @author uncle_yumo
 * @fileName Student
 * @createDate 2024/9/30 September
 * @school 无锡学院
 * @studentID 22344131
 * @description
 */

class Student constructor(name: String, age: Int) : Person(name, age), Study {
    override fun readBooks() {
        println("$name is reading books.")
    }

    override fun doHomework() {
        println("$name is doing homework.")
    }

    private fun doStudy(stu: Study) {
        stu.readBooks()
        stu.doHomework()
        stu.doHomeworkDefault()
    }

    fun main() {
        doStudy(this)
//        doStudy(Student(name, age))
    }

}

fun main() {
//    val student = Student("Uncle_Yumo", 18)
//    val student2 = Student()
    Student("Uncle_Yumo", 18).main()
}