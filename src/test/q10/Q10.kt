package test.q10

fun main() {
    var n = 0

    for (value in 1..5){
        println("$n - $value")
        n++
    }

    for((n, value) in (1..5).withIndex()){
        println("$n - $value")
    }
}