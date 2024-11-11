class Cola {
    // Init Array
    private val cola : MutableList<Int> = ArrayList()
    // Add elemento al final
    fun encolar(valor:Int) {
        cola.add(valor)
    }
    // Eliminar y devolver el primer elemento
    fun desencolar() : Int {
        cola.removeFirst()
        return cola[0]
    }
    // Verificar si esta vacia
    fun estaVacia() : Boolean {
        if (cola.isEmpty()) {
            println("La cola está vacía")
            return true
        }
        return false
    }
    // Obtener el primer elemento sin eliminarlo
    fun frente() : Int {
        return cola[0]
    }
    // Mostrar todos los elementos
    fun mostrarElementos() {
        println("Mostrando todos los elementos de la cola: \n ")
        for (valor in cola) {
            println(valor)
        }
    }
}