package FirstSteps.e2

/*Crear un cajero automatico:
Se debe poder agregar o quitar dinero del cajero.
Despues de cada operacion mostrar el total de la cuenta. */

fun main() {
    var saldo = 0
    while (true) {
        println("1. Agregar dinero")
        println("2. Retirar dinero")
        println("3. Ver saldo")
        println("4. Salir")
        val opcion = readLine()?.toInt()
        when (opcion) {
            1 -> {
                println("Ingrese la cantidad de dinero que desea agregar:")
                val cantidad = readLine()?.toInt() ?: continue
                saldo += cantidad
                println("Se han agregado $cantidad Bs. a la cuenta.")
                verSaldo(saldo)
            }
            2 -> {
                println("Ingrese la cantidad de dinero que desea retirar:")
                val cantidad = readLine()?.toInt() ?: continue
                if (cantidad > saldo) {
                    println("No se puede retirar más dinero del que hay en la cuenta.")
                } else {
                    saldo -= cantidad
                    println("Se han retirado $cantidad Bs. de la cuenta.")
                    verSaldo(saldo)
                }
            }
            3 -> verSaldo(saldo)
            4 -> {
                return
            }
            else -> println("Opción inválida")
        }
    }
}
fun verSaldo(saldo: Int) {
    println("El saldo actual de la cuenta es $saldo Bs.")
}