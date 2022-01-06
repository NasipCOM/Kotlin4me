package oop.Inheritance

fun main() {
    var dog1 = Dog("Sharik", "bark...")
    dog1.voice()
    dog1.sleep()
    dog1.hunt()

    var cat1 = Cat("Bars", "Meow...", 5)
    cat1.sleep()
    cat1.voice()
    cat1.yearsOld()
    cat1.hunt()
}