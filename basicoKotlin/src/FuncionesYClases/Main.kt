package FuncionesYClases

fun main() {
    filtro()
    lambda()
    // Instancia de la clase Pais
    val españita = Pais("España", 46000000, "Español")
    // Instancia de la clase Comunidad
    val galicia = Comunidad("Galicia", 2700000, "Gallego, Castellano")
}

// lista filtrada
fun filtro() {
    var coquito = listOf("Conquistador", "Leyenda", "Ganador")
    println("Lista completa: " + coquito)

    coquito = coquito.asSequence().filter { it[0] == 'C' }.toList()
    println("Lista filtrada con las que empiezan por C: " + coquito)
}

// Uso de funcion lambda
fun lambda() {
    var paises = 10
    val paisesConquistados: (Int) -> Int = { paises -> paises / 2 } // Pasar un INT de parametro, devuelve la mitad
    println("Hay $paises paises en total y se han conquistado " + paisesConquistados(paises)) // Hay que llamar a la variable como si fuese una funcion
}