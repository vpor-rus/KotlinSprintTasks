package org.example.lesson_12

/*Измени программу таким образом, чтобы информация о погоде выводилась в консоль сразу при создании объекта.*/

fun main() {
val tursdayWeather = DailyTemperature(
    _dayTemperature = 301,
    _nightTemperature = 290,
)
}

class DailyTemperature(val dayTemperature: Int, val nightTemperature: Int): String

fun kelvinToCelsium(temperatureKelvin: Int): Int {
    return temperatureKelvin - KELVIN_TO_CELSIUM
}

const val KELVIN_TO_CELSIUM = 275
