package oop.InterfaceAndAbstract

class Train: Moveable, Stopable {
    override var speed: Double = 290.0

    override fun stop() {
        println("Stopping")
    }

    override fun move() {
        println("Train is moving")
    }

    override fun info() {
        println("This is the fastest train in the world")
    }
}