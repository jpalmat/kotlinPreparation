import com.sun.xml.internal.fastinfoset.util.StringArray

fun main(args: Array<String>) {
    println("--unmutable list")
    var firstList: List<Int> = listOf(1, 3, 1) //arraylist

    firstList.forEach({i -> println(i) })
    println(firstList.get(0))

    println("--mutable list")
    var secondList = mutableListOf("z", "a", "b")
    secondList.forEach({x -> println(x)})

    println("--sort list")
    secondList.sort()
    secondList.forEach({x -> println(x)})

    println("--unmutable set")
    var fistSet: Set<String> = setOf("jimmy", "maryam", "jimmy")
    fistSet.forEach({i -> println(i)})

    println("--treeset")
    var secondSet: Set<String> = sortedSetOf("z", "a", "b", "a")
    secondSet.forEach({x -> println(x)})

    println("--unmutable map")
    var firstMap: Map<Int, String> = mapOf(1 to "jimmy", 2 to "maryam")
    println(firstMap.get(1))
    println(firstMap.keys)
    println(firstMap.values)
    if(3 in firstMap.keys)
        println("1 is the map")
//
//    println("tree map")
//    var secondMap: Map<>

    println("collection sort comparator")
    val stringComparator = Comparator {  x: String, y: String -> x.compareTo(y) }
    var thirdList: List<String> = listOf("z", "a", "b", "a")
    var fourthList = thirdList.sortedWith(stringComparator)
    fourthList.forEach({x -> println(x)})

    println("filter list")
    var fifthList = listOf<String>("a", "bb")
    var sixthList = fifthList.filter { it.length < 2 }
    sixthList.forEach({x -> println(x)})

    println("partition")
    var seventhList = listOf<String>("a", "aa", "b", "bb")
    var (eigthList, nineList) = seventhList.partition { it.length > 1 }
    eigthList.forEach({x -> println(x)})
    nineList.forEach({x -> println(x)})
}