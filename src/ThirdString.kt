fun main(args: Array<String>) {
    var a = "hello"[0] //character
    println(a)

    var b:String = "jimmy"
    for(i in b.indices){
        print(b[i])
    }

    println("is not necesary + $b")

    println(b.subSequence(0, 2))

    var ob1 = User("jimmy", 30)
    println(ob1)
}