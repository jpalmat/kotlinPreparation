package test.q6

fun main() {
    var b: String? = null

    //println(b== null ? 0 : b.length) //no
    //println(b?.length ?? 0) //no
    println(b?.length ?: 0) //elvis operator

    println(b!!.length) //convert a nonnull and throw exception
}