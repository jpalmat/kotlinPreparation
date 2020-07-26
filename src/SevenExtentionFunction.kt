fun main(args: Array<String>) {
    infix fun String.toSpace(x: String): String = " $x"

    String().toSpace("x")

    val test = makeMathFunction(5)
    println(test(3))

    val func1 = {num1: Int -> num1*2}
    var intLis: List<Int> = listOf(1, 2, 3 ,4, 5)

    makeOnList(intLis, func1)
}

fun makeMathFunction(num1: Int): (Int) -> Int = {num2 -> num1*num2}

fun makeOnList(list: List<Int>, myFunc: (num: Int) -> Int){
    for (i in list){
        println(myFunc(i))
    }
}