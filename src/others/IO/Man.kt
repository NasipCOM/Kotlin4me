package others.IO

fun main() {

    println("Please enter the word to guess!")
    var word = readLine()

    if (word == null){
        println("No word given, game ended!")
        return
    }
    var letters = word.lowercase().toCharArray().toHashSet()
    var correctGuesses = mutableSetOf<Char>()
    var fails = 0

    while (letters != correctGuesses){
        printExploredWord(word, correctGuesses)
        println("\n#Wrong guesses $fails")
        println("Guess the letter: ")
        val input = readLine() ?: continue

        if (word.lowercase().contains(input.lowercase())){
            correctGuesses.add(input[0])
        }else{
            fails++
        }
    }
    printExploredWord(word, correctGuesses)
    println("#Wrong guesses $fails")
    println("Well done")



}

fun printExploredWord(word: String, correctGuesses: Set<Char>){
    for (i in word.lowercase()){
        if (correctGuesses.contains(i)){
            print("$i ")
        }else print("_ ")
    }
}