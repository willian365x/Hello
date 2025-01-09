fun getNullableLength(ns: String?): Int {
    println("\t")
    return ns?.run {
        println("\tis empty: ${isEmpty()}")
        println("\tLength: $length")
        length
    } ?: 0
}


fun main(){
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")
}
