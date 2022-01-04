package basics

fun main() {
    var list1 = listOf<Int>(1, 2, 3, 5, 7, 9, 12)

    list1.forEach { e -> println(e) }

    var squares = (list1.map { e -> e * e }) // all squares of nums
    println(squares)

    var evens = list1.filter { e -> e % 2 == 0 } // all evens
    println(evens)

    var reduceSum = list1.reduce { acc, i -> i + acc  }   // sum of all elements in array, list
    println(reduceSum)

    var sorted = list1.sorted()
    println(sorted)

    var byDescending = list1.sortedDescending()
    println(byDescending)

    var anyEl = list1.any{ it > 10 }  // return boolean if any element is an array is > 10
    println(anyEl)                    // переменную нужно называть всегда it

    var allEl = list1.all { it < 100 } // если все элементы меньше < 100
    println(allEl)

    var sum = list1.sum();
    println(sum)

    val numbers = listOf<Int>(1, 2, -5, 70, -20, 30)  //делит на 2 листа по условию
    val (positive, negative) = numbers.partition { it > 0 }
    println(positive)
    println(negative)

    val result = listOf("a", "b", "ccc", "bb", "dd", "plm").groupBy { it.length } //hashMap
    println(result)
}