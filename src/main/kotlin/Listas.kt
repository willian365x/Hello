val listNumbers: MutableList<Int> = mutableListOf(1,2,3)
val sudoers: List<Int> = listNumbers

fun addNewNumber(num:Int) = listNumbers.add(num)
fun readSudoers(): List<Int> = sudoers

fun main(){
    addNewNumber(4)

    println("Total numbers: ${readSudoers().size}")
    readSudoers().forEach { n -> println("Number: $n") }
    println("Is reference? ${readSudoers() === listNumbers}")
}