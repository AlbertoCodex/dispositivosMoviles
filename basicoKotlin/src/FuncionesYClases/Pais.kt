package FuncionesYClases

// Ejemplo de Constructor
open class Pais(var nombre:String, var poblacion:Int, var idioma:String) {
    init {
        println("Objeto instanciado")
        println("El nombre es $nombre, tiene $poblacion habitantes y se habla $idioma")
    }
}

