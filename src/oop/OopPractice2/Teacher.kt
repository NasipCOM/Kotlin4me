package oop.OopPractice2

class Teacher(name: String, secondName: String, age: Int, uniWorker: Boolean, salary: Double, var subject: String)
    : Assistant(name, secondName, age, uniWorker, salary) {
        fun subject() = println("I teach $subject")
    override fun work() {
        println("Teacher teaches students")
    }
}