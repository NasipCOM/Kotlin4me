package oop.Inheritance

class Dog(name: String, voice: String): Animal(name, voice){
    override fun sleep() {
        println("The dog $name is sleeping!")
    }

    override fun voice() {
        println("The dog $name is barking")
    }

    override fun yearsOld() {
        println("This dog is too old")
    }

    public override fun hunt() {
        println("this cat $name is hunting")
    }


}