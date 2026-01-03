fun main(){
    println("Hola Mundo!")

    // ========================= VARIABLES =====================================
    /*
    * Podemos utilizar diferentes tipos de variables por ejemplo
    * String (text) Int (enteros) Double (decimales más precisos) Float (Decimales) Boolean (estado true or false)
    * */

    // Manera larga de generar una variable
    var v1 : Int = 1
    print(v1)

    // Esta es la segunda forma de declarar un valor, sin embargo, aca es Kotlin dependiendo del tipo de datos que se
    // asigne será el tipo de dato que designe.
    var v2 = 2.1
    print(v2)

    // Este error no da un error porque nos el mismo tipo de dato, no se puede reasignar el tipo de variable como en
    // python o javascript
    // v2 = "Hola"

    v2 = 4.5

    // Puedo concatenar variables
    var texto1 = "Hola "
    var texto2 = "Mundo"
    println(texto1 +  texto2)

}