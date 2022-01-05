package Practice

fun main() {
    println("Enter names using ,")
    var names = readLine().orEmpty()

    var myNames = names.split(",")

    println("Enter your salaries")

    var salaries = readLine().orEmpty()
    var mySalaries = salaries.split(",")

    println("-----------------------------")
    for (i in 0 until myNames.size){
        println("|   ${myNames[i]}     |     ${mySalaries[i]}     |")
    }
    println("-----------------------------")
}