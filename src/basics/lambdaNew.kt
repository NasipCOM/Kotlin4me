package basics

fun main() {
//    lineLogger {
//        repeat(2){
//            println("Message 1")
//            println("Message 1")
//            println("Message 1")
//            println("Message 1")
//        }
//    }
    repeater(5) {
            println("Hello")
        }

}
fun repeater(times: Int, block: () -> Unit){
    repeat(times){
        block()
    }
}
fun lineLogger(block: () -> Unit){
    repeat(5){ println("----------") }
    block()
    repeat(5){ println("----------") }
}