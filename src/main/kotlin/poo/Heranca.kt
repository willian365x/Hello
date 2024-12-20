package poo

open class Dog{
    open fun sayHello(){
        println("Dog say: wow, wow")
    }
}

class Yorkshire: Dog(){
    override fun sayHello(){
        println("Yorkshire say: wif, wif")
    }
}

fun main() {
    val dog: Dog = Yorkshire()
    val dog2 = Dog()
    dog.sayHello()
    dog2.sayHello()
}