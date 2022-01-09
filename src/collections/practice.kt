package collections

/*
* используется, для того чтобы соединить несколько arrays в один
*
* */
fun main() {
    val fruitsBag = listOf("apple","orange","banana","grapes")  // 1
    val clothesBag = listOf("shirts","pants","jeans")           // 2
    val cart = listOf(fruitsBag, clothesBag)                    // 3
    val mapBag = cart.map { it }                                // 4
    val flatMapBag = cart.flatMap { it }
    println(cart)
    println(mapBag)
    println(flatMapBag)
}