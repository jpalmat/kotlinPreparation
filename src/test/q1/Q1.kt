package test.q1

fun main() {
    val scores = listOf<Int>(4000, 2000, 10200, 12000, 9030)

    scores.forEachIndexed { index, i -> println("el index is $index and the value is $i") }
}