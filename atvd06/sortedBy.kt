// Faça um exemplo utilizando sortedBy

fun main() {
    val num = listOf(-20, 2, -3, 23, -6, 0, 78, 100)

    val numOrdenadosCrescente = num.sortedBy { it }
    val numOrdenadosDecrescente = num.sortedBy { -it }

    println("Números Crescente: $numOrdenadosCrescente \nNúmeros Decrescente: $numOrdenadosDecrescente")
}


