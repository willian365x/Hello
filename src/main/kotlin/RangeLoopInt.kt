fun contagem(n: Int) {
    for (j in 1..n) {
        Thread.sleep(500)
        print("|")
    }
}

fun main() {
    for (n in 10 downTo 1) {
        print("${n}:")
        contagem(n)
        println()
    }
}