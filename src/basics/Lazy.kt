package basics

import java.lang.Thread.sleep

fun main() {
    val name by lazy {
        println("Computed")
        sleep(3000) //long running operation
        "Nasip" }

    println(name)
    println(name)
}
