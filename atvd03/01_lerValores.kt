fun main() {
    
    // Faça um programa na Linguagem Kotlin que leia tenha 3 opções:     
    // 1 - Fatorial    
    // 2 - Quadradro de um número    
    // 3 - Volume de uma lata    
    // 4 – Sair do Programa
    // Utilize os conceitos de funções em Kotlin
    
    println("Opções: \n1 - Fatorial \n2 - Quadradro de um número \n3 - Volume de uma lata \n4 – Sair do Programa")
    print("Escolha uma opção (só digitar número): ")
    
    var num = readLine().toString().toInt()
    
    if(num == )
    
    fun fat(n1: Int, ft: Int){
        print("Digite um número: ")
        n1 = readLine().toString().toInt()
    
        ft = n1
    
        if(n1 == 0){
            println("O fatorial do número é 1")
        } else{
            while(n1 > 1){
                ft = ft * (n1 - 1)
                n1--
            }
            println("O fatorial do número é: $ft")
        }
    }
}