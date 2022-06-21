/**
 * Класс товар
 * @property name - Наименование товара [String]
 * @property price - Цена товара [Double]
 * @property kol - Количество товара [Double]
 *
 * @author Вяткин Артём
 */
open class tovar(_name:String, _price:Double, _kol:Double) {
    private var name: String
    private var price: Double
    private var kol: Double

    init {
        name = _name
        price = _price
        kol = _kol
    }
    /**
     * Расчёт качества объекта
     * @return - Качество объекта расчитывается по формуле (цена)/ (количество) [Double]
     *
     * @author Вяткин Артём
     */
    open fun Quality():  Double{

        return (price/kol)
    }
    /**
     * Вывод иныормации на экран
     * @return - Строка с информацией [String]
     * @property name - Наименование товара [String]
     * @property price - Цена товара [Double]
     * @property kol - Количество товара [Double]
     * @property Quality - Качество объекта [Double]
     *
     * @author Вяткин Артём
     */
    open fun printInfo(): String{
        return "Наименование товара: $name, Цена товара: $price, Количество товара: $kol, Качество: ${Quality()}\n"
    }
}