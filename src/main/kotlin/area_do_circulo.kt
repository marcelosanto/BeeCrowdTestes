fun main(){
    val n = readLine()?.toDouble()
    val result = (n!!*n)* PI

    println("A=${"%.4f".format(result).replace(",", ".")}")
}