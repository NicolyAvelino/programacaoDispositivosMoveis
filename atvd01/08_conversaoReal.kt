fun main() {
    
    //  Faça um programa na Linguagem Kotlin que efetue a apresentação 
    //  do valor da conversão em real de um valor lido em dólar. 
    //  O programa deve solicitar o valor da cotação do dólar e também a
    //   quantidade de dólares disponível com o usuário, para que seja 
    //   apresentado o valor em moeda brasileira.


    var cota:Double = 4.59
    var qtDolar:Double = 5.0
    
    var conv = cota * qtDolar 
    
    println("O valor da conversão de Dólar para real é $conv reais.")
}