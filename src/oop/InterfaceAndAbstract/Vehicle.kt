package oop.InterfaceAndAbstract

abstract class Vehicle(var id: Int) {
    abstract var numOfWheels: Int

    abstract fun move()
}