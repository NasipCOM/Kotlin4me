package collections

fun main() {
    var namesToAges = mapOf( Pair("Aidar", 22) , Pair("Nasip", 23))
    var namesToAges2 = mapOf(
        "Nasip" to 23,
        "Aidar" to 22
    )

    println(namesToAges == namesToAges2)
    println(namesToAges.keys)
    println(namesToAges.values)
    println(namesToAges.entries)
    println(namesToAges)

    var countryToInhabitants = mutableMapOf(
        "Germany" to 80_000_000,
        "Kyrgyzstan" to 7_000_000
    )
    countryToInhabitants.put("Australia", 23_000_000)
    countryToInhabitants.putIfAbsent("USA", 300_000_000)

    println(countryToInhabitants)

    println(countryToInhabitants.containsKey("USA"))
    println(countryToInhabitants.contains("Australia"))
    println(countryToInhabitants.get("Germany"))
    println(countryToInhabitants.getOrDefault("France", 50_000_000))

    namesToAges.entries.forEach {
        println("${it.key} is ${it.value} years old.")
    }
}