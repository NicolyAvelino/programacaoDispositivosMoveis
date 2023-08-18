fun main() {
    
    //  Faça um programa na Linguagem Kotlin  para ler dois valores inteiros 
    //  para as variáveis A e B e efetuar a troca dos valores de forma que a 
    //  variável A passe a possuir o valor da variável B e a variável B passe 
    //  a possuir o valor da variável A. Apresentar os valores trocados.


    var a:Int = 10
    var b:Int = 20
    
    var aux:Int
    
    aux = a
    a = b
    b = aux
    
    println("Valores A = $a; B = $b.")
}