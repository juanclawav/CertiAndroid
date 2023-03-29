package FirstSteps.e3

/* Crear una lista de asistencia de la clase por código UPB:
Se debe poder agregar o quitar codigos de la lista de asistencia.
Después de cada operación mostrar la lista de asistencia resultante.
La lista comienza con una lista vacia. */

fun main() {
    var listaAsistencia = mutableListOf<String>()

    while (true) {
        println("Ingrese una opción:")
        println("1. Agregar código de estudiante")
        println("2. Quitar código de estudiante")
        println("3. Ver lista de asistencia")
        println("4. Salir")
        val opcion = readLine()?.toInt()

        when (opcion) {
            1 -> {
                agregarCodigo(listaAsistencia)
                mostrar(listaAsistencia)
            }
            2 -> {
                quitarCodigo(listaAsistencia)
                mostrar(listaAsistencia)
            }
            3 -> mostrar(listaAsistencia)
            4 -> {
                return
            }
            else -> println("Opción inválida")
        }
    }
}
fun agregarCodigo(listaActual: MutableList<String>){
    println("Ingrese el código de estudiante que desea agregar:")
    val codigo = readLine() ?: return
    listaActual.add(codigo)
}
fun quitarCodigo(listaActual: MutableList<String>){
    println("Ingrese el código de estudiante que desea quitar:")
    val codigo = readLine() ?: return
    listaActual.remove(codigo)
}
fun mostrar(listaActual: MutableList<String>) {
    if (listaActual.isEmpty()) {
        println("La lista de asistencia está vacía")
    } else {
        println("La lista de asistencia actual es:")
        listaActual.forEach { println(it) }
    }
}