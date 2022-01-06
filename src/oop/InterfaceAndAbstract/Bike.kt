package oop.InterfaceAndAbstract

class Bike(id: Int): Vehicle(id) {
    override var numOfWheels = 2

    override fun move() {
        println("The bike is moving!")
    }

}