package Practice

fun main() {
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()
    var operator = readLine()

    when(operator){
        "+" -> println(num1 + num2)
        "-" -> println(num1 - num2)
        "*" -> println(num1 * num2)
        "/" -> println(num1 / num2)
    }

}