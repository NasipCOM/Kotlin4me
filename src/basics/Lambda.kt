package basics

fun main() {
    val greeter: (String, String) -> String = { name: String, secondName: String -> "Hello $name $secondName"}

    val greeting = greeter("Nasip", "Salmakhunov")
    println(greeting)
}