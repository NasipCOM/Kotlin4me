package Others.IO

import kotlin.random.Random

fun main() {
    val number = Random.nextInt(100) + 1
    var input: String?
    var guess = -1

    while (guess != number){
        print("Guess the number betwee 0 and 100: ")
        input = readLine()
        if (input != null){
            guess = input.toInt()
        }
        if (guess < number) println("It is bigger than $guess")
        else if (guess > number) println("It is lower than $guess")
        else println("You won!")

    }
}