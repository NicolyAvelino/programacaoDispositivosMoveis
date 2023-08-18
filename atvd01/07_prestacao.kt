fun main() {
    
    //  Faça um programa na Linguagem Kotlin para efetuar o cálculo e a 
    //  apresentação do valor de uma prestação em atraso, utilizando a 
    //  fórmula PRESTAÇÃO <-- VALOR + (VALOR * (TAXA/100) * TEMPO).


    var vlr:Double = 240.0
    var taxa:Double = 3.0
    var tempo:Int = 10
    var prest = vlr + (vlr * (taxa/100) * tempo)
    
    println("O valor da prestação em atraso é R$ $prest")
}