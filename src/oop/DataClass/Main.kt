package oop.DataClass

/*
* 1 The Data prints all the information about data class because its string method overridden
* 2 We also can compare two object using equals method it will compare all properties of the classes
* and if all of them are the same then it will return true
* 3 Also we have copy() method which creates the same object with all fields and it the
* same time we can change the value of any properties
* 4 We can decompose each object into their properties and use them differently
* 5 We could create a hashset or hashmap that contains objects of dataclasses*/

fun main() {
    var book = Book("Kyrgyzstan", "Alisher", 55.5)
    var book1 = Book("Kyrgyzstan", "Alisher", 55.5)
    var bookData = DataBook("Kyrgyzstan", "Alisher", 55.5)
    var bookData2 = DataBook("Kyrgyzstan", "Alisher", 55.5)
    var bookData3 = bookData.copy(price = 3.5)

    println(bookData.equals(bookData2))

    println(book)
    println(bookData)

    val (title, author, price) = bookData;
    println(title)

    //set removes the similar objects so we have 2 objects now
    val set = hashSetOf<DataBook>(bookData, bookData2, bookData3)
    println(set)
    // if we use set with non-Data class it will not remove the duplicates ex:
    val set2 = hashSetOf<Book>(book, book1)
    println(set2)


}