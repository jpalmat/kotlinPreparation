fun main(args : Array<String>) {
    println("Hello");

    val name = "Jimmy" //unmutable
    var age = 30 //mutable

    println(name + " "+ age)

    var bigInt = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE
    println(bigInt)
    println(smallInt)

    var bigLong = Long.MAX_VALUE
    var smallLong: Long = Long.MIN_VALUE
    println(bigLong)
    println(smallLong)

    var bigDouble: Double = Double.MAX_VALUE
    var smallDouble: Double = Double.MIN_VALUE
    println(bigDouble)
    println(smallDouble)

    var bigFloat = Float.MAX_VALUE
    var smallFloat: Float = Float.MIN_VALUE
    println(bigFloat)
    println(smallFloat)

    var characterTest: Char = 'A'
    println(characterTest is Char)

}