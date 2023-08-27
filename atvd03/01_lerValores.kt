fun main() {

    // Faça um programa na Linguagem Kotlin que leia tenha 3 opções:     
    // 1 - Fatorial    
    // 2 - Quadradro de um número    
    // 3 - Volume de uma lata    
    // 4 – Sair do Programa
    // Utilize os conceitos de funções em Kotlin
    
    var cd: Int

    do {
        println("Opções: \n1 - Fatorial \n2 - Quadradro de um número \n3 - Volume de uma lata \n4 – Sair do Programa")
        print("Escolha uma opção (só digitar número): ")
        cd = readLine().toString().toInt()

        when (cd) {
            1 -> {
                println()
                print("Digite um número para o fatorial: ")
                val num = readLine().toString().toInt()
                println("O fatorial de $num é ${fat(num)}")
            }
            2 -> {
                println()
                print("Digite um número para saber o quadrado do mesmo: ")
                val num = readLine().toString().toDouble()
                println("O quadrado de $num é ${quadrado(num)}")
            }
            3 -> {
                println()
                print("Digite o raio da lata: ")
                val raio = readLine().toString().toDouble()
                print("Digite a altura da lata: ")
                val altura = readLine().toString().toDouble()
                println("O volume da lata é ${volume(raio, altura)}")
            }
            4 -> println("Saindo do programa.")
            else -> println("Opção inválida. Por favor, digite números de 1 a 4.")
        }
        println()
    } while (cd != 4)
}

fun fat(n: Int): Long{
    if (n == 0 || n == 1) {
        return 1
    } else {
        return n * fat(n - 1)
    }
}

fun quadrado(n: Double): Double {
    return n * n
}

fun volume(raio: Double, altura: Double): Double {
    return Math.PI * raio * raio * altura
}