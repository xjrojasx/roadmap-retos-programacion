// MI CODIGO

// https://kotlinlang.org

////////////////////////////////
//     TIPOS DE COMENTARIO    //
////////////////////////////////

// comentario de una línea

/* comentario dee varias líneas
   puede ocupar más de una línea.
*/

/** esto es un comentario de documentación (Kdoc)
 * sirve para documentar funciones, clases, etc.
 */
 
/////////////////////////////////
//    VARIABLES Y CONSTANTE    //
/////////////////////////////////

/* var es una variable mutable (se puede modificar el valor)*/
var varialble = 17

/* val es una varialble local inmutable o constante (no puede modifcarse su valor)*/
val constante = 11

////////////////////////////////////
//   TIPOS DE DATOS PRIMITIVOS    //
////////////////////////////////////

/* Tipo Entero (Int) */
val entero: Int = 7

/* Tipo Decimal (double y float) */
val decimal: Double = 2.5
val decimal2: Float = 3.5f

/* Tipo Carcater (char) */
val caracter: Char = 'A'

/* Tipo Booleano (boolean) */
var booleano: Boolean = true
var booleano2: Boolean = false

////////////////////////////
//   TERMINAL DE TEXTO    //
////////////////////////////


fun main() {
  println("hola, kotlin")
  
  var saludo = "hola, kotlin"
  println("$saludo")
}
