class Pila {
    // Init Array
    private var pila : MutableList<Int> = ArrayList()
    // Add elemento
    fun apilar(valor:Int) {
        pila.add(valor)
    }
    // Eliminar y devolver el elemento superior
    fun desapilar() : Int {
        pila.removeLast()
        return pila[pila.size - 1]
    }
    // Verificar si esta vacia
    fun estaVacia() : Boolean{
        if (pila.isEmpty()) {
            println("La pila está vacía")
            return true
        }
        return false
    }
    // Obtener el ultimo elemento
    fun cima() : Int{
        return pila[pila.size - 1]
    }
    // Mostrar elementos de la pila
    fun mostrarElementos() {
        println("Mostrando todos los elementos de la pila: \n ")
        for (valor in pila) {
            println(valor)
        }
    }
}