package oop.OopPractice2

abstract class Person(val name: String, val secondName: String, var age: Int) {

    fun walk(){
        println("The person is walking")
    }
    abstract fun work()

    fun info(){
        println("Person's full name is $name $secondName and age is $age")
    }
}