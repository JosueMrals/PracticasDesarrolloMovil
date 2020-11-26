fun main()
{
    var nombre = "Josue"
    //nombre = "Gerardo" /* Muestra el segundo valor dado que se esta reasignando la variables asi que muestra el nuevo valor */

    println("Mi nombre es: $nombre")

    val apellido = "Morales"
    //apellido = "Castillo" /* Aqui muestra el primer valor porque el val no permite la reasignacion asi que toma el primer valor como el unico valido */

    println("Mi apellido es: $apellido")

    var edad = "19"

    println("Mi nombre es $nombre $apellido y tengo $edad años")
}