package oop.OopVectors

import kotlin.math.sqrt

class Vector(val x: Double, val y: Double, val z: Double) {

    fun sqrt(): Double = sqrt(x + y + z)

    fun scalarProduct(v1: Vector): Double {
        return (v1.x * x + v1.y * y + v1.z * z)
    }

    fun crossProduct(v1: Vector): Vector {
        return Vector(y = y * z - z * y,
                      x = z * x - x * z,
                      z = x * y - y * x)
    }

    fun add(v1: Vector): Vector{
        return Vector(  z = v1.z + z,
                        x = v1.x + x,
                        y= v1.y + y)
    }
    fun subtract(v1: Vector): Vector{
        return Vector(  z = v1.z - z,
            x = v1.x - x,
            y= v1.y - y)
    }

}