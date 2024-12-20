package fundamentals

fun vogais(nome: String) {
    val vogais = setOf("aeiou")
    for (x in nome) {
        if (x in vogais.iterator().next()) {
            print(x)
        }
    }
}

fun consoantes(nome: String) {
    val vogais = setOf("aeiou")
    for (x in nome) {
        if (x !in vogais.iterator().next()) {
            print(x)
        }
    }
}

fun main() {
    println("Quais vogais e consoantes possui seu nome?")
    println("Digite seu nome:")
    val nome = readln()

    println("Seu nome possui essas vogais: ")
    vogais(nome)
    println()
    println("Seu nome possui essas consoantes: ")
    consoantes(nome)
}