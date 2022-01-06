package oop.InterfaceAndAbstract

interface Moveable {

    // это как абстрактный филд
    var speed: Double

    fun move()

    fun info(){
        println("hi")
    }
}