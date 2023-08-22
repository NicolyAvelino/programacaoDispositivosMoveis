fun main() {
    
    //  Faça um programa na Linguagem Kotlin que leia quatros valores 
    //  referentes a quatro notas escolares de um aluno e imprimir uma 
    //  mensagem dizendo que o aluno foi aprovado, se o valor da média 
    //  escolar for maior ou igual a 7. Se o aluno não foi aprovado, indicar 
    //  uma mensagem informando esta condição. Apresentar junto das mensagens 
    //  o valor da média do aluno para qualquer condição.
      
    var n1: Double
    var n2: Double
    var n3: Double
    var n4: Double
    var media: Double
    
    print("Digite o valor da 1º nota: ")
    n1 = readLine().toString().toDouble()
    
    print("Digite o valor da 2º nota: ")
    n2 = readLine().toString().toDouble()
    
    print("Digite o valor da 3º nota: ")
    n3 = readLine().toString().toDouble()
    
    print("Digite o valor da 4º nota: ")
    n4 = readLine().toString().toDouble()
    
    media = (n1 + n2 + n3 + n4) / 4
    
    if(media >= 7){
        println("\nParabéns, você foi aprovado!\nSua média é: $media")
    } else {
        println("\nInfelizmente, você foi reprovado!\nSua média é: $media")
    }
    
    
}