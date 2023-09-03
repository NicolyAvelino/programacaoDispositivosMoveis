fun main() {

    // Criar um vetor A do tipo inteiro de 5 elementos
    // – Solicitar os valores para o usuário e inserir no vetor A
    // – Criar um vetor B do tipo inteiro  
    // – Ler o vetor A e para cada elemento lido calcular o fatorial e gravar no B
    // – Após de todos os elementos do vetor A, mostrar os dois vetores
    
    val vetA = IntArray(5)
    val vetB = IntArray(5)
    var fat: Int
    
    for (i in vetA.indices) {
        print("Digite o ${i + 1}º número para cálculo de Fatorial: ")
        vetA[i] = readLine().toString().toInt()
    }

    for (i in vetA.indices) {
        vetB[i] = vetA[i]
    }

    for (i in vetB.indices) {
        fat = 1
        for (j in 1..vetB[i]) {
            fat *= j
        }
        vetB[i] = fat
    }

    for (i in vetA.indices) {
        println("Número: ${vetA[i]} Fatorial: ${vetB[i]}")
    }
   
}