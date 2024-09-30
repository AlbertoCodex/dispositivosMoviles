package ConceptosBasicos

fun main() {
    condiciones()
    iteracionArray()
}

// Condiciones y Booleanos
fun condiciones() {
    val pescados = 50
    val plantas = 23
    // Operadores (<, ==, >, !=, <=, >=)
    println("Comprobando si hay más pescados que plantas")
    if (pescados > plantas) {
        println("Buen ratio!")
    } else {
        println("Necesitas más pescados o menos plantas")
    }
    // Rangos
    println("Comprobando si hay peces y cuantos hay")
    if (pescados in 1..100) {
        println(pescados)
    }
    // When
    println("Estado de la pecera")
    when (pescados) {
        0  -> println("Pecera vacía")
        in 1..39 -> println("Hay algunos peces")
        else -> println("Hay muchos peces")
    }
}

// Arrays y Loops
fun iteracionArray() {
    val clase = arrayOf("DI", "PDMYM", "PSP") // Array Asignaturas del curso
    println("La asignatura son: ")
    for (asignatura in clase) { // Iteracion del array
        print(asignatura + ", ")
    }
}