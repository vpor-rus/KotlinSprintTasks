package org.example.lesson_2

/*Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути,
 а время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.*/

fun main() {

    val startTimeInMinutes = (HOUR_START * 60) + MINUTES_START

    val finishTimeInMinutes = startTimeInMinutes + TRAVEL_TIME_MINUTES

    println("${finishTimeInMinutes / 60}:${finishTimeInMinutes % 60}")
}
const val HOUR_START = 9
const val MINUTES_START = 39
const val TRAVEL_TIME_MINUTES = 457