package test.q2

fun main() {
    var product = Product()
    println(product.price)
    //product.price = 11 //error
    product.addPrice()
    println(product.price)
}

class Product {
    var price: Int = 10
    private set

    fun addPrice(){
        price+=1
    }
}