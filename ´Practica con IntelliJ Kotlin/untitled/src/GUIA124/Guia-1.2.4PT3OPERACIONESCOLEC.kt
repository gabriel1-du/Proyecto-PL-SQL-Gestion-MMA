package GUIA124

fun main(){

    /*
    Filtrado de Productos: Escribe una línea de código que genere una nueva lista
    conteniendo únicamente los productos (mapas) que pertenecen a una categoría
    específica. Utiliza la función filter.
     */


    //Creacion de objetos MAP
    var Producto1 = mapOf("Nombre" to "Pepsi", "Categoria" to "Comida")
    var Producto2 = mapOf("Nombre" to "Pizza", "Categoria" to "Comida")
    var Producto3 = mapOf("Nombre" to "Hacha", "Categoria" to "Herramientas")

    //Creacion de una lista
    var Inventario = listOf(Producto1, Producto2, Producto3)

    val filtroAplicado = Inventario.filter { it["Categoria"] == "Comida" }
    print(filtroAplicado)


    /*
    Mapeo de Datos: Escribe una línea de código que genere una nueva lista que
    contenga solo los nombres de todos los productos del inventario. Utiliza la función
    map.
     */

    val mapAplicado = Inventario.map { it["Nombre"] }

    print(mapAplicado)
}