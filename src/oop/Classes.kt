package oop

fun main() {

    val child1 = Person("Sabit", "Salmakhunov", 9)

    val p1 = Person("Nasip", "Salmakhunov", 23, child1)
    println(p1.lastName)

    val rectangle1 = Rectangle(12.0, 4.0)
    println(rectangle1.perimeter)
    val rectangle2 = Rectangle(12.0, 4.0)
    println(rectangle1 == rectangle2)
}

//Primary constructor - первичный конструктор

class Person(val name:String, val lastName:String, var age: Int){
    var children = mutableListOf<Person>()

    init {
        println("Person is created! $name")
    }

    constructor(name:String, lastName:String, age: Int, child:Person):
                this(name, lastName, age){
                    children.add(child)
                }

    //Конструктор без аргументов

    constructor():this("", "", -1)
}

/*
С помощью слова дата мы можем использовать equals,
hashcode equal и мы можем сравнить объекты по филдам, в джаве нужно
переопределить equals в классе и только после этого
можно сравнивать к примеру только по id.
*/

data class Rectangle(var height: Double, var length: Double){
    var perimeter = (height + length) * 2

    // Custom getters and setters
    var test = 1
        get() = field + 1
        set(value){
            if (value < 0) println("Negative value!")
            field = value
        }
    fun area() = height * length
}