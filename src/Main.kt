/**
 * Функция main с вводом данных с консоли
 */
fun main(){
    println("Введите вид воиск:")
    var typeOfMilitary = readLine()!!.toString()

    println("Введите численность:")
    var countOfPeople = readLine()!!.toInt()

    println("Введите вооруженность в баллах:")
    var armament = readLine()!!.toInt()

    println("Введите опыт бойцов:")
    var experience = readLine()!!.toInt()

    val army : Army = Army(typeOfMilitary, countOfPeople, armament)
    army.Info()

    val millitary : MilitaryActions = MilitaryActions(typeOfMilitary, countOfPeople, armament, experience)
    millitary.Info()
}