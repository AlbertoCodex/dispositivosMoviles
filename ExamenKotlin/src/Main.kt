fun main() {
    // Init Clases
    var pila = Pila()
    var cola = Cola()
    var x = -1

    while (x != 0) {
        println("0- Para Salir \n 1- Pilas \n 2- Colas")
        x = readln().toInt()
        when(x) {
            0 -> println(println("Hasta luego"))
            1 -> menuPila(pila)
            2 -> menuCola(cola)
        }
    }
}

fun menuPila(pila: Pila) {
    var x = -1
    while (x != 0) {
        println("0- Para Salir \n 1- Apilar \n 2- Desapilar \n 3- EstaVacia \n 4- Cima \n 5- MostrarElementos")
        x = readln().toInt()
        when (x) {
            0 -> println("Hasta luego")
            1 -> {
                println("Introduce el valor a añadir")
                pila.apilar(readln().toInt())
            }
            2 -> {
                if(!pila.estaVacia()) { println( "Se ha eliminado el último elemento y el actual es : " + pila.desapilar()) }
            }
            3 -> { if (!pila.estaVacia()) { println("La pila no está vacía") } }
            4 -> {if (!pila.estaVacia()) { println("El último elemento de la pila es: " + pila.cima()) } }
            5 -> { if(!pila.estaVacia()) { pila.mostrarElementos() } }
        }
    }
}

fun menuCola (cola: Cola) {
    var x = -1
    while (x != 0) {
        println("0- Para Salir \n 1- Encolar \n 2- Desencolar \n 3- EstaVacia \n 4- Frente \n 5- MostrarElementos")
        x = readln().toInt()
        when (x) {
            0 -> println("Hasta luego")
            1 -> {
                println("Introduce el valor a añadir")
                cola.encolar(readln().toInt())
            }
            2 -> if(!cola.estaVacia()) { println( "Se ha eliminado el primer elemento y el actual es : " + cola.desencolar()) }
            3 -> { if (!cola.estaVacia()) { println("La cola no está vacía") } }
            4 -> { if (!cola.estaVacia()) { println("El primer elemento de la cola es: " + cola.frente()) } }
            5 -> { if(!cola.estaVacia()) { cola.mostrarElementos() } }
        }
    }
}