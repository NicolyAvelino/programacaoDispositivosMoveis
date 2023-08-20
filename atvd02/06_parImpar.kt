fun main() {
    
    //   Faça um programa na Linguagem Kotlin que efetue a leitura de 
    //   um número inteiro e apresentar uma mensagem informando se o número 
    //   é par ou ímpar.

    var num: Int
    
    print("Digite o um número: ")
    num = readLine().toString().toInt()
    
    if(num%2==0){
    	println("O número $num é par")
    } else{           
    	println("O número $num é ímpar")
    } 
        
}