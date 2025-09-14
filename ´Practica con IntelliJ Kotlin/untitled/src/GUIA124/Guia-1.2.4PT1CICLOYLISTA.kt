package GUIA124

fun main(){

    //Creacion de clases con Map

    var Producto : Map<String, Any> = mapOf(

        "Nombre" to "Pizza",
        "Categoria" to "Alimento"

    )

    println(Producto["Nombre"])

    //Creacion de lista inmutable

    //Creacion de objetos inmutables tipo mapOf
    var Animal = mapOf("Nombre" to "Odie", "Raza" to "Perro")
    var Animal2 = mapOf("Nombre" to "Boby", "Raza" to "Perro")
    var Animal3 = mapOf("Nombre" to "Maria", "Raza" to "Jirafa")
    var Animal4 = mapOf("Nombre" to "Esperanza", "Raza" to "Suricata")
    var Animal5 = mapOf("Nombre" to "Vicente", "Raza" to "Chancho")
    var Animal6 = mapOf("Nombre" to "Pepe", "Raza" to "Sapo")


    //CREACION DE LISTA INMUTABLE
     val lista = listOf(Animal, Animal2, Animal3, Animal4, Animal5, Animal6)
    //Creacion de la funcion
    //Recibe por parametros el nombre de tipo String
    //Como segunda variable es una lista lista de tipo Map

    fun busqueda(nombre: String, lista: List<Map<String, String>>): Map<String, String>? {
        for (animal in lista) {
            if (animal["Nombre"] == nombre) {
                return animal
            }
        }
        return null
    }

    var resultado = busqueda("Esperanza", lista)
    println(resultado)






}