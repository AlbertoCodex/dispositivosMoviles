import kotlin.random.Random

// Constructor
class Matriz(val fila:Int, val columna:Int) {
    val matriz: Array<Array<Int>>
    // Inicializar variable 2D Array, valores random
    init {
        matriz = Array(fila) { Array(columna) { Random.nextInt(0, 10) } } // Random numbers between 0 and 9
    }
    // Imprimir matriz por consola
    fun mostrarMatriz() {
        for (row in matriz) {
            println(row.joinToString(" "))
        }
    }
    // Modificar valores por consola
    fun modificarValores(matriz: Matriz) {
        for (i in 0 until matriz.fila) {
            for (j in 0 until matriz.columna) {
                matriz.mostrarMatriz()
                matriz.matriz[i][j] = readln().toInt()
            }
        }
    }
}