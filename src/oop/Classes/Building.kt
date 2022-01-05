package oop.Classes

class Building(var floors: Int, var apartments: Int, var name: String){

    fun destroy(){
        println("Destroying....")
    }

    fun build(){
        println("Building....")
    }
}