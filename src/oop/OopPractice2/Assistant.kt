package oop.OopPractice2

open class Assistant(name: String, secondName: String, age: Int, var uniWorker: Boolean, var salary: Double)
    : Person(name, secondName, age ){

    fun workerOrNOt(){
        if (uniWorker) println("Works in uni")
    }

    override fun work() = println("The assistant helps teacher")

    private fun studentLabs(){
        println("The $name helps students with exercises")
    }



}