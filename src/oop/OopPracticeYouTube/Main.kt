package oop.OopPracticeYouTube

import kotlin.system.exitProcess

fun main() {

    var moscow = MoscowCoffeeShop(5.9, 3.5, 6.0)
    var newYork = NewYorkCoffeeShop(4.0, 6.30, 2.4)

    while (true){
        println("Hello choose the city")
        println("1. Moscow\n2. New York\n\n0. Exit")
        
        var currentCoffeeShop: CoffeeShop = when (readLine()) {
            "1" -> moscow
            "2" -> newYork
            "0" -> break
            else -> {
                println("Error")
                continue
            }
        }
        chooseDrink(currentCoffeeShop)
    }

}

private fun chooseDrink(currentCoffeeShop: CoffeeShop){
    println("Choose a drink")
    println("1. Americano \n2. Cappuccino \n3. Latte\n\n0. Show statistics")

    when (readLine()) {
        "1" -> {
            currentCoffeeShop.makeAmericano()
            checkAndAskForBiscuits(currentCoffeeShop)
        }
        "2" -> {
            currentCoffeeShop.makeCappuccino()
            checkAndAskForBiscuits(currentCoffeeShop)
        }
        "3" -> {
            currentCoffeeShop.makeLatte()
            checkAndAskForBiscuits(currentCoffeeShop)
        }
        "0" -> {
            currentCoffeeShop.showStatistics()
        }
        else -> {
            println("Error")
            exitProcess(1)
        }
    }
}

fun checkAndAskForBiscuits(currentCoffeeShop: CoffeeShop){
    if (currentCoffeeShop is Biscuits) {
        println("Would you like biscuits?")
        println("1. Yes \n2. No")

        val biscuits = readLine()

        if (biscuits == "1") currentCoffeeShop.sellBiscuit()
    }
}