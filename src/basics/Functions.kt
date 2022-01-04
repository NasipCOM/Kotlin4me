package basics

fun main() {
    println(addition(5, 7))
    println(multiplication(5, 8))
    println(testString(20))
    println(namedArguments(z = 1, y = 5, x = 50))    //Можно вот так не по порядку написать или просто (50, 5, 1)

    defaultArgs()
    defaultArgs(y = 5)
    defaultArgs(y = 20, x = 100)
    defaultArgs(30, 50)

    println(foo("Nasip", toUpper = true))

    printEvent(2, 3, 4, 5, 7, 8)                       //так
    printEvent(*intArrayOf(1, 2, 3, 4, 5, 6, 7), 50, 23, 44)    // или так, можно еще дописать элементы
}

/*
если одна строка, можно написать вот так "=" = return
если аргументы Int  котлин может предугадать и писать тип не обязательно
*/

fun addition(a:Int, b:Int): Int = a + b
             //==
fun multiplication(a: Int, b:Int): Int {
    return a * b
}
fun testString(x: Int): String{
    return "This num is $x"
}
fun namedArguments(x:Int, y:Int, z:Int):List<Int>{
    return listOf(x, y, z)
}
fun defaultArgs(x:Int = 5, y: Int = 10){ // если не указываем то будет тип функции то будет как void
    println(x*y*x)
}

/*
* В джаве надо было бы написать 4 перегруженыех методов
* чтобы написай такую функцию а тут всего пару строк
* */

fun foo(name: String, number: Int = 42, toUpper: Boolean = false){
    (if (toUpper) name.toUpperCase() else name) + number
}

/*
vararg нужен для того чтобы принимать сколько угодно аргументов какого то типа
numbers приходит как массив, но перечислять нужно через запятую или использовать * перед массивом
см пример
*/

fun printEvent(vararg numbers: Int){
    numbers.forEach { el -> if (el % 2 == 0) println(el) }
}