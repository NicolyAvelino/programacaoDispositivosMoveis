fun main() {
    //  Faça um programa na Linguagem Kotlin que leia dois valores numéricos 
    //  e presentar a diferença do maior para o menor.
    
    println("Digite o 1º número: ")
    var n1 = readLine().toString().toInt()
    
    println("Digite o 2º número: ")
    var n2 = readLine().toString().toInt()
    
    var dif : Int

    
  	if (n1 > n2){
        dif = n1 - n2
        println("A diferença do número $n1 para o $n2 é $dif.")
    } else{
        dif = n2 - n1
        println("A diferença do número $n2 para o $n1 é $dif.")

    }
}