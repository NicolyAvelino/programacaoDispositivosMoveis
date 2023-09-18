// Faça um exemplo utilizando filter

fun main() {
    val num = listOf(-20, 2, -3, 23, -6, 5, 78, 100)
    val numPar = num.filter { it % 2 == 0 }

    println("Números pares: $numPar")
}
