fun main() {
    
    //   O cardápio de uma lanchonete é o seguinte:                       
    //   Especificação 	Código 	Preço
    //   Cachorro quente 	100 		1,20
    //   Bauru simples 	101 		1,30
    //   Bauru com ovo 	102 		1,50
    //   Hambúrger 		103 		1,20
    //   Cheeseburguer 	104 		1,30
    //   Refrigerante 		105 		1,00
    //   Faça um programa na Linguagem Kotlin que leia o código do item pedido, 
    //   a quantidade e calcule o valor a ser pago por aquele lanche. 
    //   Considere que a cada execução somente será calculado um item.

    var cd: Int
    var qt: Int
    var pg: Double
    var preco: Double
    
    println("CARDÁPIO \nEspecificação Código Preço \nCachorro quente 100 1.20 \nBauru simples 101 1.30 \nBauru com ovo 102 1.50 \nHambúrger 103 1.20 \nCheeseburguer 104 1.30 \nRefrigerante 105 1.00\n")
    
    print("Digite o código do item pedido: ")
    cd = readLine().toString().toInt()
    
    print("Digite a quantidade que deseja pedir: ")
    qt = readLine().toString().toInt()
    
    if(cd == 100){
       preco = 1.20;
    } else if(cd == 101){
		preco = 1.30;
	} else if(cd == 102){
		preco = 1.50;
	}else if(cd == 103){
		preco = 1.20;
	}else if(cd == 104){
		preco = 1.30;
	}else{
		preco = 1.00;
	}
    
    pg = preco * qt
    
    println("Valor a ser pago: R$ $pg")
    
        
}