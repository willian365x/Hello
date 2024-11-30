fun printCakeEat() = println("Cake eat!")
fun printCakeBake() = println("Cake bake!!")

fun main() {
    var cakesEat = 0
    var cakesBake = 0

    while (cakesEat < 5) {
        Thread.sleep(1000)
        printCakeEat()
        cakesEat++
    }

    do {
        Thread.sleep(1000)
        printCakeBake()
        cakesBake++
    } while (cakesBake < cakesEat)
}