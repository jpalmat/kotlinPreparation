package test.q4

fun main() {
    var list: MutableList<Int> = mutableListOf(1, 2, 3, 4)
    list.forEach({x -> println(x)})

    println("iterator")
    val listIterator = list.listIterator()

    while(listIterator.hasNext()){
        listIterator.set(listIterator.next() + 1)
    }

    list.forEach({x -> println(x)})
}