package basics

fun main() {

    testWhen(4);
    testWhen("Java")
}

fun testWhen(input: Any){
    when(input){
        1 -> println("One")
        "Java" -> println("Best language!")
        true -> println(false)
        in 1..10 -> println(input)
    }
}