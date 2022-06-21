/**
 * Класс спортсмен
 * @property name - Наименование товара [String]
 * @property price - Цена товара [Double]
 * @property kol - Количество товара [Double]
 * @property P - Год выпуска товара [Int]
 * @property T - Текущий год [Int]
 *
 * @author Вяткин Артём
 */
class tovarchild(_name:String, _price:Double, _kol:Double, _P:Int): tovar(_name,_price,_kol) {
    private  var P: Int
    private var T: Int =2022
    init {
        P = _P
    }
    /**
     * Расчёт качества объекта ( потомок )
     * @return Качетсво объекта потомка
     * @author Вяткин Артём
     */
    override fun Quality(): Double {
        return super.Quality() +0.5*(T-P)
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
    open override fun printInfo(): String {
        return super.printInfo()
    }
}