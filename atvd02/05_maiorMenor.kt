fun main() {
    // ARRUMAR =================================
    //   Faça um programa na Linguagem Kotlin que efetue a leitura de cinco números inteiros 
    //   e identificar o maior e o menor valor. Não execute a ordenação de valores.

    var num = 0
    var maior: Int
    var menor: Int
    var i = 1
    
    maior = num
    menor = num
    
    while(i < 6){
        print("Digite o $i número: ")
        num = readLine().toString().toInt()
        
            if(num > maior){
                maior = num
            } else if(num < menor){
                    menor = num
           	}
       	i++
    }

    println("O maior número é: $maior.\nO menor número é: $menor.")
    
}