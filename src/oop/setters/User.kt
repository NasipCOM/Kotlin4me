package oop.setters

class User(var firstName: String, var secondName: String, var age: Int) {
    override fun toString(): String {
        return "User [ Name: $firstName, secondName: $secondName, age: $age ] "
    }
}