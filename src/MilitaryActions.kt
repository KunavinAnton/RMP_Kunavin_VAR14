/**
 *Класс наследник [MilitaryActions]
 *Свойства конструктора:

 * @param _Experience - опыт бойцов
 */
class MilitaryActions(_typeOfMilitary: String, _countOfPeople: Int, _armament: Int, _Experience:Int) : Army(_typeOfMilitary, _countOfPeople, _armament) {
    private  var experience: Int

    init{
        experience = _Experience
    }

    /**
     * Метод для вычисления качества
     *
     * @return возвращает качество перемножая значение метода [Quality] класса [Army] и ([experience] + 1)
     */
    override fun Quality(): Double {
        return super.Quality() * (experience + 1)
    }

    /**
     * Метод для вывода информации
     */
    override fun Info(){
        println("===MilitaryActions===\nОпыт: $experience\nКачество: ${Quality()}")
    }
}