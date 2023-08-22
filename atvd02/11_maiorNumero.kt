fun main() {
    
    // Faça um programa na Linguagem Kotlin que leia 3 números inteiros e mostre o maior deles
	
    print("Digite o 1º número: ")
    var n1 = readLine().toString().toInt()
    
    print("Digite o 2º número: ")
    var n2 = readLine().toString().toInt()
    
    print("Digite o 3º número: ")
    var n3 = readLine().toString().toInt()
    
    if(n1 > n2 && n1 > n3){
	    println("O maior número é: $n1.")
	} else if(n2 > n1 && n2 > n3){
    	println("O maior número é: $n2.")
	} else{
    	println("O maior número é: $n3.")
	}   
        
}