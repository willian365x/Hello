fun printCustomer(text: String?) {
    println(text?.uppercase())
}

fun printIsNotNull(str: String?) {
    str?.let {
        print("\t")
        printCustomer("Printing...$it")
        println()
    }
}

fun printTwoCustomer(str1: String?, str2: String?) {
    str1?.let { firstStr ->
        str2?.let { secondStr ->
            printCustomer("$firstStr | $secondStr")
        }
    }
}