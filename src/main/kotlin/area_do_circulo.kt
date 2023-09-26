const  val PI = 3.14159
fun main(){
    val n = readLine()?.toDouble()
    val result = (n!!*n)* PI

    println("A=${"%.4f".format(result).replace(",", ".")}")
}