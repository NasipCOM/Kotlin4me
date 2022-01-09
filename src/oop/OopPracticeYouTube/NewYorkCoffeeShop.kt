package oop.OopPracticeYouTube

class NewYorkCoffeeShop(americanoPrice: Double, cappuccinoPrice: Double, lattePrice: Double) :
    CoffeeShop(americanoPrice, cappuccinoPrice, lattePrice){

    override fun makeAmericano() {
        println("Thanks for ordering Americano in New York")
        americanoCount++
    }

    override fun makeCappuccino() {
        println("Thanks for ordering Cappuccino in New York")
        cappuccinoCount++
    }

    override fun makeLatte() {
        println("Thanks for ordering Latte in New York")
        latteCount++
        }
}