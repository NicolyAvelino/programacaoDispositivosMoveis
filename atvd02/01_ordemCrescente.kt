fun main() {
    //  Faça um programa na Linguagem Kotlin que leia 3 (três) valores 
    //  inteiros e apresente os 3 números em ordem crescente. 
    
    var n1: Int
    var n2: Int
    var n3: Int
    
    print("Digite o 1º numero: ")
    n1 = readLine().toString().toInt()
    
    print("Digite o 2º numero: ")
    n2 = readLine().toString().toInt()

    print("Digite o 3º numero: ")
    n3 = readLine().toString().toInt()
    
    if (n3 > n1){
			if (n1 > n2){
			println("Ordem crescente dos números: $n2 $n1 $n3")
			} else if (n2 < n3){
                println("Ordem crescente dos números: $n1 $n2 $n3")
			}
		}
		if (n1 > n2){
			if (n2 > n3){
                println("Ordem crescente dos números: $n3 $n2 $n1")
			} else if (n3 < n1){
                println("Ordem crescente dos números: $n2 $n3 $n1")
			}
		}
		if (n1 < n2){
			if (n3 < n1){
                println("Ordem crescente dos números: $n3 $n1 $n2")
			} else if (n3 < n2){
                println("Ordem crescente dos números: $n1 $n3 $n2")  
            }
        }
}