package oop.OopVectors

fun main() {
    var v1 = Vector(4.0, 6.0, 8.0)
    var v2 = Vector(8.0, 9.0, 12.0)

    println(v1.sqrt())
    println(v2.add(v1).sqrt())

    var v3 = v1.add(v2)
    println(v3.sqrt())
}