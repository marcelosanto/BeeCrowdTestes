fun main(args: Array<String>) {
    val n1 = readln()
    val n2 = readln()

    println(sumOfList(n1))
    println(sumOfList(n2))
}

fun sumOfList(numeros: String) : Int {
    var  result = 0
    numeros.split(" ").toList().forEach {
        result += it.toInt()
    }

    return result
}