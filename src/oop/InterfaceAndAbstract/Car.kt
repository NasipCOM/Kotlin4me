package oop.InterfaceAndAbstract

class Car(id: Int): Vehicle(id), Moveable, Stopable {

    override var speed: Double = 300.0

    override fun info() {
        println("This is car")
    }


    override fun stop() {
        println("Car is stopping")
    }

    override var numOfWheels: Int = 4

    override fun move() {
        println("The car is moving!")
    }
}