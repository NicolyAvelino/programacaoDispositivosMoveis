// Fazer um programa para ler os dados de um funcionário (nome, salário Bruto e Desconto). 
// Em seguida, mostrar os dados do funcionário (nome e salário líquido). 
// Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada e 
// mostrar novamente os dados do funcionário. Use a classe projetada abaixo:
// funcionário
// + nome: String
// + salarioBruto: double
// + desconto: double
// salarioLiquido(): double
// aumentarSalario(porcentagem: double) : void

class Funcionario(var nome: String, var salBruto: Double, var desc: Double) {

    fun salLiq(): Double {
        return salBruto - desc
    }

    fun aumentarSalario(porc: Double) {
        val aumento = salBruto * (porc / 100)
        salBruto += aumento
    }
}

fun main() {
    print("Digite o nome do funcionário(a): ")
    val nome = readLine().toString()

    print("Digite o salário bruto do funcionário(a): ")
    val salBruto = readLine().toString().toDouble()

    print("Digite o desconto do funcionário(a): ")
    val desc = readLine().toString().toDouble()

    val funcionario = Funcionario(nome, salBruto, desc)

    println("\nDados do funcionário(a): \nNome: ${funcionario.nome} \nSalário Líquido: ${funcionario.salLiq()}")

    funcionario.aumentarSalario(15.0)

    println("\nDados do funcionário(a) após aumento de salário de 15%: \nNome: ${funcionario.nome} \nSalário Bruto: ${funcionario.salBruto} \nSalário Líquido: ${funcionario.salLiq()}")
}
