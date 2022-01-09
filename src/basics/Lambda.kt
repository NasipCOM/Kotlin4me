package basics

fun main() {
    val greeter = { name: String, secondName: String ->
        val modifiedName = name.lowercase()
        val modifiedSecondName = secondName.uppercase()
        "Hello $modifiedName $modifiedSecondName"}

    val greeting = greeter("Nasip", "Salmakhunov")
    println(greeting)

    // Unit = Void in Java

    val greeter1 = { name: String, secondName: String  ->
        val modifiedName = name.lowercase()
        val modifiedSecondName = secondName.uppercase()
        println("Hello $modifiedName $modifiedSecondName")}

    val greeting1 = greeter1("Nasip", "Salmakhunov")






}