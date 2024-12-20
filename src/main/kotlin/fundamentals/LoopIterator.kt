package fundamentals

class Animal(val name: String)
class Zoo(val animals: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun main() {
    val animals = listOf(Animal("Mula"), Animal("Jegue"))
    val zoo = Zoo(animals)

    for (animal in zoo) {
        println("Zoo animal: ${animal.name}")
    }
}