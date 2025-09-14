package GUIA112

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //MANEJO DE VARIABLES
    //Inicializando variables con null
    var v1 : Int? = null
    var v2 : Double? = null

    //Suma
    v1 = 5
    v2 = 1.5
    println("SUMA : ${v1 + v2}")

    //Resta
    println("RESTA : ${v1 - v2}")

    //Division
    println("DIVISION : ${v1/v2}")

    //Multiplicacion
    println("MULTIPLICACION: ${v1*v2}")


    println("---------------------------------")
    //MANEJO DE NULOS
    var variableNula : String? = null

    variableNula = "Variable String"

    println(variableNula?.length)

    variableNula = null

    println(variableNula?.length)

    println("----------------------------")
    //Logica de condicional con when
    var v = 2

    when(v){
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sabado")
        7 -> println("Domingo")
    }

}