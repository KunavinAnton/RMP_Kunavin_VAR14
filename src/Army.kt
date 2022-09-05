/**
 * @author Kunavin Anton PR-33
 *Базовый класс [Army]
 *Свойства конструктора:
 * @param _typeOfMilitary - вид войск
 * @param _countOfPeople - численность (тыс человек)
 * @param _armament - вооруженность (баллы - число).
 */
open class Army(_typeOfMilitary: String, _countOfPeople: Int, _armament: Int) {
    private var typeOfMilitary:String
    private var countOfPeople:Int
    private var armament: Int

    init{
        typeOfMilitary = _typeOfMilitary
        countOfPeople = _countOfPeople
        armament = _armament
    }

    /**
     * Метод оценки качества
     *
     * @return возвращает значение качества из формулы 0.3 * [countOfPeople] + 0.7 * [armament]
     */
    open fun Quality():Double{
        return 0.3  * countOfPeople + 0.7 * armament
    }

    /**
     * Метод для вывода информации
     */
    open fun Info(){
        println("===Army===\nВид войск: $typeOfMilitary\nЧисленность: $countOfPeople\nВооруженность: $armament\nКачество: ${Quality()}")
    }
}