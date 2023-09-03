fun main() {

    // Fazer um procedimento para receber as notas da primeira e da segunda prova de cinco alunos. 
    // Armazenar as notas da primeira e da segunda prova em vetores distintos. 
    // Calcular e escrever a média de cada aluno.
    val num = 5
    val nota1 = DoubleArray(num)
    val nota2 = DoubleArray(num)

    for (i in 0 until num) {
        print("\nEntrada de dados da nota 1º prova do aluno ${i + 1}: ")
        nota1[i] = readLine().toString().toDouble()

        print("Entrada de dados da nota 2º prova do aluno ${i + 1}: ")
        nota2[i] = readLine().toString().toDouble()
    }
    println()
    for (i in nota1.indices) {
        println("A média do ${i + 1}º aluno é: ${(nota1[i] + nota2[i]) / 2.0}")
    }
}