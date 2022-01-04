package basics

/*
* Мы не можем положить null в стринг, чтобы сделать это нужно использовать "?"
* а также Null pointer exception полностью исключён
* */

fun main() {
    var a: String = "Hello"
    a.length

    var b: String? = "Test"
    b = null
//    b.length не сработает потому что создали с вопросом
//    safe call
    b?.length

    // Elvis operator
    //if b == true , l = b, else l = 1
    val l = b?.length ?: -1

    b = if ((0..10).random() > 5) "hello World" else null
    //!! выбрасывает NPE если в переменной нулл
    val t = b!!.length


 }