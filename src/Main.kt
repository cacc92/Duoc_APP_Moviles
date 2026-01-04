fun main(){
//    println("Hola Mundo!")
//
//    // ========================= VARIABLES =====================================
//    /*
//    * Podemos utilizar diferentes tipos de variables por ejemplo
//    * String (text) Int (enteros) Double (decimales más precisos) Float (Decimales) Boolean (estado true or false)
//    * */
//
//    // Manera larga de generar una variable
//    var v1 : Int = 1
//    println(v1)
//
//    // Esta es la segunda forma de declarar un valor, sin embargo, aca es Kotlin dependiendo del tipo de datos que se
//    // asigne será el tipo de dato que designe.
//    var v2 = 2.1
//    println(v2)
//
//    // Este error no da un error porque nos el mismo tipo de dato, no se puede reasignar el tipo de variable como en
//    // python o javascript
//    // v2 = "Hola"
//
//    v2 = 4.5
//
//    // Puedo concatenar variables
//    var texto1 = "Hola "
//    var texto2 = "Mundo"
//    println(texto1 +  texto2)
//
//    // ========================= CONSTANTES =====================================
//    // Una constante siempre van a tener un mismo valor, en vez de generar var uno tendría que ponder val, la diferencia
//    // entre estos dos tipos es que var utiliza menos memoria a diferencia de val, es como una mochila que puede
//    // almacenar muchas cosas diferentes, sin embargo, la constante va a tener un empaque mucho más óptimo.
//    // Siempre utilizar constantes si sabemos que el valor no cambiará
//    val pi = 3.14
//
//    // ================ Null safety / valores opcionales =========================
//    // Variable que pueden ir cambiando el valor mediante eje
//    // var x = null
//    var x : String? = null
//    x = "Hola César Carrasco!"
//    println(x)
//
//    // De esta forma podemos realizar operaciones cuando el valor realmente exista
//    x?.let{
//        println("tiene valor")
//    }
//
//    // Pantalla a y b quiero enviar de listado de usuarios a detalle de usuario
//    var id : Int? = null
//    id?.let {
//        println("Valor id: $it")
//    }
//
//    // ===================== CAMBIO TIPO DE DATOS Y CONCATENACIONES ===========================
//    // cuando quiero que sea de un tipo de datos y despues cambiarlo de tipo de datos
//
//    val num1 = 5
//    // Puede venir otro tipo de dato desde una base de datos
//    val num2 = "10"
//    // De esta manera puedo convertir desde un string a al revés
//    val res = num1 + num2.toInt()
//    println(res)
//
//    val t1 = "Hola"
//    val t2 = "Mundo"
//    // De esta manera puedo concatenar unas variables
//    val texto = "$t1 $t2"
//    println(texto)
//
//    // La funcion de plus me permite concatenar
//    val resultado = t1.plus(" ".plus(t2))
//    println(resultado)
//
//    val array = arrayOf("Hola", "Mundo")
//    val res2 = array.joinToString(" ")
//    println(res2)
//
//    // ====================== Escribir en consola ===================================
//    val resultadoSuma: Double
//    var n1 : Double
//    var n2 : Double
//
//    while (true){
//        try {
//            println("Escribe el primer valor: ")
//            n1 = readln().toDouble()
//
//            println("Escribe el segundo valor: ")
//            n2 = readln().toDouble()
//            break
//        } catch (e: NumberFormatException) {
//            println("Error : escribe un número válido $e")
//        }
//    }
//
//    resultadoSuma = n1 + n2
//    println(resultadoSuma)
//
//    var num = 1
//    while (num <= 10) {
//        println("El valor de num es: $num")
//        num++
//    }

    // =================== Arrays, listas For ======================
    var array = arrayOf("César", "Carrasco", 2, 2.5, true)
    println(array.contentToString())

    var numeros = intArrayOf(1,2,3,4,5)
    println(numeros.contentToString())

    println(array[1])

    array[1] = "Mario López"
    println(array[1])

    println("La cantidad de elementos son: "+ numeros.size)

    array += "Sergio"
    println(array.contentToString())

    var nums = intArrayOf(4,3,6,8,9,1)
    nums.sort()
    println(nums.contentToString())

    var numbers = intArrayOf(2,2,5,7,8,8,3,5,6)
    numbers.sort()
    println(numbers.contentToString())

    var duplicate = numbers.groupBy { it }.filter { it.value.size > 1 }.keys
    duplicate.sorted()
    println(duplicate)

}
