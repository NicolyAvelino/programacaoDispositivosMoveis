// Faça um exemplo uma variável do tipo função anônima (slide 5)
// slide 5 ->
// fun main(){
//     val soma = {x: Int, y: Int -> x + y}
//     println(soma(6,3))
// }

fun main() {
   val mult = { n1: Int , n2: Int -> n1 * n2 }
   println(mult(3,5))
}