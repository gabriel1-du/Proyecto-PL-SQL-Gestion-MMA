package GUIA124


//Creacion de la funcion calculo
//Recibe como parametro un String y un Any
//Devuelve un Float
fun calculo(lista : List<Map<String, Any>>): Double{

    //Aca se iran sumando los precios
    var acumulador = 0.0 // 0.0 para decir que es float

    //Producto es la variable que recorre la lista
    for (producto in lista){

        //Y decimos que sea producto pero la clave "Precio"
        acumulador += (producto["Precio"] as? Number?:0.0).toFloat()

    }
    //Dentro del return hacemos el calculo
    return acumulador/lista.size
}

fun main(){

    //Creacion de objetos Map
    var Producto1 = mapOf("Nombre" to "Pepsi", "Precio" to 5)
    var Producto2 = mapOf("Nombre" to "Pepsi", "Precio" to 10)

    //Creacion de la lista
    var Inventario = listOf(Producto1, Producto2)


    print(calculo(Inventario))


}