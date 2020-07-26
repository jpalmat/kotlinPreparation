package test.q3

fun main() {

    val sortedList: (Int) -> Boolean = { num: Int -> num%2!=0 }

    var list2 = (80..100).toList().filter(sortedList)

    println(list2)
}