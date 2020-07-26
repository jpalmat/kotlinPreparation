package test.q9

fun main() {
    fun <T : Comparable<T>> sort(list: List<T>): List<T> {
        return list.sorted()
    }
}