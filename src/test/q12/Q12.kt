package test.q12

fun main() {
    for (count in 1.rangeTo(1000)){
        println(simple(count))
    }
}

inline fun simple(num: Int) : Int {
    return num * num
}