fun main(args: Array<String>) {
    infix fun String.toSpace(x: String): String = " $x"

    String().toSpace("x")

    val test = makeMathFunction(5)

    println(test(3))
}

fun makeMathFunction(num1: Int): (Int) -> Int = {num2 -> num1*num2}