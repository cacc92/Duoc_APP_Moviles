fun main(){
    println("Hola Mundo!")

    // ========================= VARIABLES =====================================
    /*
    * Podemos utilizar diferentes tipos de variables por ejemplo
    * String (text) Int (enteros) Double (decimales más precisos) Float (Decimales) Boolean (estado true or false)
    * */

    // Manera larga de generar una variable
    var v1 : Int = 1
    println(v1)

    // Esta es la segunda forma de declarar un valor, sin embargo, aca es Kotlin dependiendo del tipo de datos que se
    // asigne será el tipo de dato que designe.
    var v2 = 2.1
    println(v2)

    // Este error no da un error porque nos el mismo tipo de dato, no se puede reasignar el tipo de variable como en
    // python o javascript
    // v2 = "Hola"

    v2 = 4.5

    // Puedo concatenar variables
    var texto1 = "Hola "
    var texto2 = "Mundo"
    println(texto1 +  texto2)

    // ========================= CONSTANTES =====================================
    // Una constante siempre van a tener un mismo valor, en vez de generar var uno tendría que ponder val, la diferencia
    // entre estos dos tipos es que var utiliza menos memoria a diferencia de val, es como una mochila que puede
    // almacenar muchas cosas diferentes, sin embargo, la constante va a tener un empaque mucho más óptimo.
    // Siempre utilizar constantes si sabemos que el valor no cambiará
    val pi = 3.14

    // ================ Null safety / valores opcionales =========================
    // Variable que pueden ir cambiando el valor mediante eje
    // var x = null
    var x : String? = null
    x = "Hola César Carrasco!"
    println(x)

    // De esta forma podemos realizar operaciones cuando el valor realmente exista
    x?.let{
        println("tiene valor")
    }

    // Pantalla a y b quiero enviar de listado de usuarios a detalle de usuario
    var id : Int? = null
    id?.let {
        println("Valor id: $it")
    }

}