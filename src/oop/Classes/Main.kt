package oop.Classes

fun main() {
    var building1 = Building(10, 30, "Ulan2")
    var building2 = Building(25, 100, "Kok Jar")

    building1.destroy()
    building2.build()

    var apartment1 = Apartment(50.0, 30.0, 3)
    var apartment2 = Apartment()

    println(apartment2.squares())
    println("It has ${apartment1.squares()}")

}