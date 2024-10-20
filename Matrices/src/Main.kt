fun main() {
    // Inicializar matriz cuadrada
    var matrizCuadra = matrizCuadrada(4)

    /*
        // Inicializar matriz valores por consola
        var matrizTest = Matriz(3,5)
        matrizTest.modificarValores(matrizTest)

        // Probando metodos
        // matrizUnidad()
        matrizUnidad(matrizTest)
        // matrizTriangular()
        matrizTriangular(matrizTest)
        // matrizNula()
        matrizNula(matrizTest)
        // matrizDiagonal()
        matrizDiagonal(matrizTest)
        // matrizUnidad()
        matrizUnidad(matrizTest)
        // matrizTriangular()
        matrizTriangular(matrizTest)
     */
}
// Instancia objeto tipo Matriz
fun matrizCuadrada(size:Int): Matriz {
    return Matriz(size,size)
}
// Comprueba si es cuadrada == True
fun matrizIsCuadrada(matriz: Matriz): Boolean {
    return matriz.columna == matriz.fila
}
// Comprueba si todos los elementos son 0
fun matrizNula(matriz:Matriz): Boolean {
    println("--Comprobando si es una matriz nula-- ")
    for (i in 0 until matriz.fila) {
        for (j in 0 until matriz.columna) {
            if (matriz.matriz[i][j] != 0) {
                println("No es una matriz nula")
                return false
            }
        }
    }
    println("Es una matriz nula")
    return true
}
// Comprueba si es diagonal y si todos los elementos fuera de la diagonal principal son 0
fun matrizDiagonal(matriz: Matriz): Boolean {
    if (matrizIsCuadrada(matriz)) {
        println("--Comprobando si es una matriz diagonal-- ")
        for (i in 0 until matriz.fila) {
            for (j in 0 until matriz.columna) {
                if (j != i && matriz.matriz[i][j] != 0) {
                    println("No es una matriz diagonal")
                    return false
                }
            }
        }
        println("Es una matriz diagonal")
        return true
    }
    println("No es una matriz diagonal")
    return false
}
// Comprueba si es diagonal y si en la diagonal principal tienen valor 0 o 1
fun matrizUnidad(matriz: Matriz): Boolean {
    if (matrizDiagonal(matriz)) {
        println("--Comprobando si es una matriz unidad-- ")
        for (i in 0 until matriz.fila) {
            for (j in 0 until matriz.columna) {
                if (j == i && matriz.matriz[i][j] != 1) {
                    println("No es una matriz unidad")
                    return false
                }
            }
        }
        println("Es una matriz unidad")
        return true
    }
    println("No es una matriz unidad")
    return false
}
// Comprueba si es cuadrada y si los elementos por debajo o por encima de la diagonal principal son 0
fun matrizTriangular(matriz: Matriz): Boolean {
    var codigo:Int = 0
    if (matrizIsCuadrada(matriz)) {
        println("--Comprobando si es una matriz triangular-- ")
        // Comprobando parte derecha
        for (i in 0 until matriz.fila) {
            for (j in 0 until matriz.columna) {
                if (j > i && matriz.matriz[i][j] != 0) codigo++
            }
        }
        // Si el valor es 0, todos los valores de arriba-derecha son 0
        if (codigo != 0) {
            // Comprobando parte izquierda
            for (i in 0 until matriz.fila) {
                for (j in 0 until matriz.columna) {
                    if (j < i && matriz.matriz[i][j] != 0) return false
                }
            }
        }
        println("Es una matriz triangular")
        return true
    }
    return false
}