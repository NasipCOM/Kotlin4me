package oop.OopPracticeYouTube

class MoscowCoffeeShop(americanoPrice: Double, cappuccinoPrice: Double, lattePrice: Double) :
    CoffeeShop(americanoPrice, cappuccinoPrice, lattePrice), Biscuits{

    override fun makeAmericano() {
        println("Thanks for ordering Americano in Moscow")
        americanoCount++
    }

    override fun makeCappuccino() {
        println("Thanks for ordering Cappuccino in Moscow")
        cappuccinoCount++
    }

    override fun makeLatte() {
        println("Thanks for ordering Latte in Moscow")
        latteCount++
    }

    override fun sellBiscuit() {
        println("Take your biscuit!")
    }
}