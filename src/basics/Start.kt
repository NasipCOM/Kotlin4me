package basics

fun main(){
    var s = "hello World!"

    val input = readLine()
    println(input?.uppercase())

    println(s.first())
    println(s.last())
    println(s.startsWith("He"))
    println(s.replaceFirstChar { e -> e.uppercaseChar()})
    println(s.trim())  // removes the spaces
    println(s.replace("World", "person"))
    println(s.split(""))

}