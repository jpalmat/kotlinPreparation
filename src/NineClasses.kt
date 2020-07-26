fun main(args: Array<String>) {

    val animal = Animal("Lucas", 4.0)
}

//the open keyword allows to modify the class, because by the default all the classes are final
open class Animal(var name: String, var age: Double) {
    init {
        println("the name is $name and the age is $age")
    }
}