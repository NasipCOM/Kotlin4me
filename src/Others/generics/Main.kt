package Others.generics


class Stack<T>(vararg val items: T){

    private val elements = items.toMutableList()


    fun push(element: T){
        elements.add(element)
    }
    fun pop(): T? {
        if (!isEmpty() )
            return elements.removeAt(elements.size - 1)
        return null
    }

    fun isEmpty(): Boolean = elements.isEmpty()
}

fun <N> stackOf(vararg items: N): Stack<N>{  //generics in functions
    return Stack(*items)                    //spread operator
}

fun main() {
    var stack1 = Stack(1, 3, 4, 6)

    println(stack1.pop())
    println(stack1.pop())
    println(stack1.pop())

    println(stackOf(2, 3 ,5 , 7, 8).pop())
}
