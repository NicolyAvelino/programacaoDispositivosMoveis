fun main() {
    //  Faça um programa na Linguagem Kotlin que efetue a leitura de um valor
    // inteiro positivo ou negativo e apresentar o número lido como sendo um 
    // valor positivo, ou seja, o programa deverá apresentar o módulo de um 
    // número fornecido.
    
 
    
    println("Digite o um numero: ")
    var n1 = readLine().toString().toInt()
    
  	if (n1 < 0){
        n1 = n1 *-1
		println("Número positivo é $n1")
    } else{
        println("Número positivo é $n1")
    }
    	       
   
}