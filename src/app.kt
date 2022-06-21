fun main()
{
    println("Базовый класс")
    val Pepsi = tovar ("Пепси",74.0,5.0)
    println(Pepsi.printInfo())
    println("Класс потомка")
    val PepsiChild= tovarchild("Пепси",74.0,5.0,2020)
    println(PepsiChild.printInfo())
}






