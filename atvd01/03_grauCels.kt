fun main() {
    
    //  Faça um programa na Linguagem Kotlin que leia uma temperatura
    //  em graus Fahrenheit e apresentá-la convertida em graus Celsius. 
    //  A formula de conversão é C <-- (F - 32) * (5/9), sendo f a temperatura 
    //  em Fahrenheit e C a temperatura em Celsius.


    
	var fahr:Double = 70.0
    
    var cels = (fahr - 32) * 5/9
    
    println("$fahr ºF => $cels ºC")
}