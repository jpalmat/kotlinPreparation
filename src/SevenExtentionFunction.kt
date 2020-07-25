fun main(args: Array<String>) {
    infix fun String.toSpace(x: String): String = " $x"

    String().toSpace("x")
}

