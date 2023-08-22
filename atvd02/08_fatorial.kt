fun main() {
    
    //  Faça um programa na Linguagem Kotlin que que receba um número 
    //  e mostre o fatorial desse número.

    var num: Int
    var ft: Int
        
    print("Digite um número: ")
    num = readLine().toString().toInt()
    
    ft = num
    
    if(num == 0){
        println("O fatorial do número é 1")
    } else{
        while(num > 1){
            ft = ft * (num - 1)
            num--
        }
        println("O fatorial do número é: $ft")
    }
}