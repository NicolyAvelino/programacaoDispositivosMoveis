fun main() {
    
    //  Faça um programa na Linguagem Kotlin que leia a idade de uma 
    //  pessoa expressa em ano, mês e dia e mostre-as em dias.


    var ano:Int = 2000
	var mes:Int = 8
    var dia:Int = 23
    
    var dias = (ano * 360) + (mes * 30) + dia
    
    println("Você tem: $dias")
}