fun main() {
    
    //  Faça um programa na Linguagem Kotlin que apresente os valores de 
    //  conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, 
    //  iniciando a contagem em 10 graus Celsius e finalizando em 100 
    //  graus Celsius. O programa deve apresentar os valores das 
    //  duas temperaturas.
	
    var c = 10
    var f: Int
    var soma = 0
    var i = 0
    
    while(c <= 100){
        f = (9 * c + 160) / 5;
        soma += i
        
        println("$c°C => $f°F\n")
        
        c += 10
    }      
        
}