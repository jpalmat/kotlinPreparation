import com.sun.jdi.Bootstrap

fun main() {

    var bird = Bird("Lucas", true)
    bird.flies(1.0)
}

interface Flyable {
    var flie: Boolean
    fun flies(distance: Double): Unit
}

class Bird(val name: String, override var flie: Boolean) : Flyable{
    override fun flies(distance: Double): Unit {
        if(flie)
            println("the $name flies $distance miles")
    }
}