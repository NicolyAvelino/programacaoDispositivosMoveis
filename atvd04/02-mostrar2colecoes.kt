fun main() {

    // Criar uma coleção “A” na linguagem Kotlin com 10 elementos
    // – Inserir os elementos de 1 a 10 na coleção
    // – Criar uma outra coleção B que conterá o elemento da coleção A multiplicado por 2
    // – Mostrar as duas coleções 
    // Obs. Não efetuar a leitura de 10 elementos
    
    val A = mutableListOf<Int>()
    for (i in 1..10) {
        A.add(i)
    }
    
    val B = A.map { it * 2 }

    println("Coleção A: \n$A \nColeção B: \n$B")

}