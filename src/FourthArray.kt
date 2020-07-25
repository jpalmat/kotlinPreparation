fun main(args: Array<String>) {
    var myArray = intArrayOf(1, 2, 4, 3)

    for(i in myArray.indices) {
        println(myArray[i])
    }

    var secondArray = myArray.copyOfRange(1, 2)

    for(i in secondArray.indices) {
        println(myArray[i])
    }
}