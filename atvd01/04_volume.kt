fun main() {
    
    //  Faça um programa na Linguagem Kotlin  para calcular e apresentar o 
    //  valor do volume de uma lata de óleo, utilizando a 
    //  fórmula:VOLUME <-- 3.14159 * RAIO2 * ALTURA.


    var diametro:Double = 6.2
	var raio:Double = diametro/2 
    var altura:Double = 10.0
    
    var volume:Double = 3.14159 * (raio*raio) * altura
    
    println("O volume é $volume cm³.")
}
