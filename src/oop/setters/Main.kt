package oop.setters

class Animal{
    var age: Int = 0
        get() = field
        set(value){if (value >= 0) field = value}
}

fun main() {
    var animal1 = Animal()
    animal1.age = 5
    animal1.age = -1
    println(animal1.age)
}