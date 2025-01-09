fun main() {
    val textIsEmpty = "Willian".let {
        printCustomer(it)
        it.isEmpty()
    }

    println("Is empty: $textIsEmpty")
    printIsNotNull(null)
    printIsNotNull("Carla")

    printTwoCustomer("Jonathan",null)

    getNullableLength("Carla")
}