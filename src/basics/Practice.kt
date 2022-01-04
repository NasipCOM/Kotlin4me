package basics

fun main() {
    println(isPrime(5))

    var arr1 = listOf<Int>(1, 5, 3, 6, -70, -3)
    var arr2 = listOf<Int>(12, 45, 32, -1)
    println(mergeArrays(arr1, arr2))

    testVararg(2, 3, -4, 5, -6, 7, -8,)

    var randNums = mutableListOf<Int>()
    for (i in 1 .. 10)
        randNums.add((1..100).random())

    maxMinAverage(randNums)
}

fun isPrime(num: Int):Boolean{
        for (i in 2 until num){
            if (num % i == 0)
                return false
       }
    return true
}

fun mergeArrays(arr1:List<Int> = listOf(5, 2, 1, 0), arr2:List<Int> = listOf(20,-30, -40)):List<Int>{
    val mergedArr = mutableListOf<Int>()
    arr1.forEach{ i -> mergedArr.add(i)}
    arr2.forEach{ i -> mergedArr.add(i)}
    mergedArr.sortDescending()
    return mergedArr
}

fun testVararg(vararg numbers: Int){
    println(numbers.map { el -> el * el })
    println(numbers.filter { el -> el % 2 == 0 })
    println(numbers.forEach { el -> println(el) })
    println(numbers.any { it < 10 })
    println(numbers.all { it < 10})
    println(numbers.average())
    println(numbers.sum())

    var(positive, negative) = numbers.partition { it > 0 }
    println(positive)
    println(negative)
}

fun maxMinAverage(numbers:List<Int>){
    println(numbers)
    println("The average is ${numbers.average()}")
    println("The max number is ${numbers.maxOrNull()}")
    println("The min number is ${numbers.minOrNull()}")
}
