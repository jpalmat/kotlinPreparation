import java.lang.IllegalArgumentException

fun main(args: Array<String>) {
    val divisor = 0

    try {
        if(divisor==0)
            throw IllegalArgumentException("can not")
        else {
            println("5 /$divisor = ${5/divisor}")
        }
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}