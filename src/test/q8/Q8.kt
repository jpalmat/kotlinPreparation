package test.q8

fun main() {
    val seq = sequence<Int> { yieldAll(1..20) }.filter { it<11 }
    seq.forEach { x -> println(x) }
}