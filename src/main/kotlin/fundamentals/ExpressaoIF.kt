package fundamentals

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun main() {
    println(max(-1, 5))
    println(max(-1, -5))
}