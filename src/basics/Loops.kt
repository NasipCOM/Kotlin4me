package basics

fun main() {

    //array creation
    val items = listOf("apple", "banana", "orange")
    val items1 = listOf<String>("apple", "banana", "orange")
    val items2 = mutableListOf<Int>(1, 2, 3, 5, 6) //ArrayList

    //for loop
    for (item in items2)
        print(item)
    println()


    //while
    var index = 0;
    while (index < items.size){
        println(items[index])
        index++
    }

    //Диапазоны
    println(5 in 3..10) // true

    for (i in 1..20)
        print(i)
        println()

    for (i in 1 until 20) // чтобы исключить последный элемент поэтому будет 19
        print(i)
        println()

    for (i in 10 downTo 1) // в убывающем порядке
        print(i)
        println()

    for (i in 0..100 step 10) // step по через каждые 10
        print(i)
        println()
}