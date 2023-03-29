package FirstSteps.e1

/*Calcular el número primo No. 20.
El número de primo a buscar debe ser una constante o un input del programa.
*/
fun main() {
    val numprimo = 20
    var contador = 0
    var numeroActual = 1

    while (contador < numprimo) {
        numeroActual++
        if ((2 until numeroActual).none { numeroActual% it == 0 }) {
            contador++
        }
    }
    println("El número primo No.$numprimo es $numeroActual")
}
