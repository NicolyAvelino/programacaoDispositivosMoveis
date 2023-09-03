fun main() {

    // Criar uma coleção na linguagem Kotlin com 10 elementos 
    // – Inserir os elementos de 1 a 10 no vetor 
    // – Após a inserção, somente após a inserção mostrar o vetor.
    // Obs. Não efetuar a leitura de 10 elementos
    // Criar uma coleção (List) vazia
    
    val vet = mutableListOf<Int>()

    for (i in 1..10) {
        vet.add(i)
    }
    println("Valores inseridos: \n$vet")

   
}