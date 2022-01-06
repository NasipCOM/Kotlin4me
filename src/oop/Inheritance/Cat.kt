package oop.Inheritance

class Cat(name: String, voice: String, var age: Int,
          ) :Animal(name, voice) {

    override fun sleep(){
        println("Cat is sleeping")
    }
    override fun yearsOld() = println("This cat $name is $age years old!")

    public override fun hunt() {
        println("This cat $name is hunting")
    }

}