package basics

typealias AuthToken = String

fun main() {
    var user1 = User("Nasip", "LDKWNOOWANDU@@#!@#%%%85539#Kj")
}


data class User(val username: String, val authToken: AuthToken)

data class Order(val authToken: AuthToken /* = kotlin.String */)