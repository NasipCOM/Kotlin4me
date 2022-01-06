package oop.Inheritance

abstract class Animal(var name: String, private var voice: String) {

    init {
        println("The animal is created!")
    }

    protected open fun hunt(){
        println("animal is hunting")
    }

    open fun voice() = println(voice)
    open fun sleep() = println("The $name is sleeping...")
    abstract fun yearsOld()
}