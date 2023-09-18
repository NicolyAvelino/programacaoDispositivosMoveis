// Faça um exemplo utilizando reduce
data class Roupa(val modelo: String, val preco: Double)

fun main() {
    val roupas = listOf(
        Roupa("Camiseta", 25.0),
        Roupa("Calça Jeans", 85.0),
        Roupa("Camisa Social", 60.0),
        Roupa("Vestido", 90.0)
    )

    val somarPrecos = { total: Double, roupa: Roupa -> total + roupa.preco }

    val precoTotal = roupas.map { it.preco }.reduce { total, preco -> total + preco }

    println("O total é R$ $precoTotal")
}