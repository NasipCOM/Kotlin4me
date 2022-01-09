package oop.OopPractice2

fun main() {
    var ass1 = Assistant("Nasip", "Salmakhunov", 23, true, 8000.0)
    var teacher1 = Teacher("Nasip", "Salmakhunov", 55, true, 90000.0,
        "Java and Kotlin OOP programming")

    println(ass1.salary)
    ass1.workerOrNOt()
    ass1.info()

    teacher1.subject()
    teacher1.work()
    teacher1.info()
    teacher1.workerOrNOt()
}