fun main() {
    //loops()
    //funciones()
    classes()
}

/*
 *  Aqui vamos a hablar de bucles
 */
fun loops() {
    // Creamos un array de ejemplo
    val myArray = listOf("Hola", "Bienvenido", "Adios")

    // Bucle for
    for (myString in myArray) {
        println(myString)
    }

    // Bucle for de rango de valores
    for (x in 0..10) {
        println(x)
    }

    // Bucle for de rango de valores, sin el ultimo
    for (x in 0 until 10) {
        println(x)
    }

    // Bucle for de rango de valores, cada 2 valores
    for (x in 0..10 step 2) {
        println(x)
    }

    // Bucle for de rango de valores en descenso, cada 3 valores
    for (x in 10 downTo 0 step 3) {
        println(x)
    }

    // Creamos una variable de ejemplo
    var x = 0

    // Bucle while
    while (x < 10) {
        println(x)
        x += 2
    }
}

/*
 *  Aqui vamos a hablar de funciones
 */
fun funciones() {
    // Funcion simple
    sayHello()
    sayHello()

    // Funcion con parametro de entrada
    sayMyName("Sergey")
    sayMyName("Juan")

    // Funcion con varios parametros de entrada
    sayMyNameAndAge("Sergey", 20)
    sayMyNameAndAge("Juan", 19)

    // Funcion con valor de retorno
    val resultado = sumTwoNumbers(10, 5)

    // Mostramos el resultado de la suma guardada
    println(resultado)

    // Mostramos la funcion sin guardar el resultado
    println(sumTwoNumbers(6, 5))

    // Mostramos funciones concatenadas
    println(sumTwoNumbers(6, sumTwoNumbers(6, 5)))
}
fun sayHello() {
    println("Hola")
}
fun sayMyName(nombre: String) {
    println("Hola, mi nombre es $nombre")
}
fun sayMyNameAndAge(nombre: String, edad: Int) {
    println("Hola, mi nombre es $nombre y mi edad es $edad")
}
fun sumTwoNumbers(num1: Int, num2: Int) : Int {
    val sum = num1 + num2
    return sum
}

/*
 *  Aquí vamos a hablar de clases
 */
fun classes() {

    // Creamos un objeto Programmer
    val sergey = Programmer("Sergey", 20, arrayOf(Programmer.language.JAVA, Programmer.language.KOTLIN), null)

    // Mostramos un dato del objeto
    println(sergey.name)

    // Cambiamos el dato edad
    sergey.age = 21

    // Mostramos la edad
    println(sergey.age)

    // Creamos un objeto Programmer
    val juan = Programmer("Juan", 19, arrayOf(Programmer.language.C, Programmer.language.JAVASCRIPT), arrayOf(sergey))

    // Usamos una funcion de la clase
    juan.code()

    println("${juan.friends?.first()?.name} es amigo de ${juan.name}")
}