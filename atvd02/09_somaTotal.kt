fun main() {
    
    //  Faça um programa na Linguagem Kotlin para apresentar o total da 
    //  soma obtida dos cem primeiros números inteiros 
    //  ( 1 + 2 + 3 + 4 + .... 98+ 99+ 100).

    var soma = 0
    var i = 0
    
    while(i<=100){
        soma += i
        
        i++
    }
    
    println("A soma total obtida dos cem primeiros números é: $soma")
    
}