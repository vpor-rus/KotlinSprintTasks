package org.example.lesson_12

/*Измени программу таким образом, чтобы информация о погоде выводилась в консоль сразу при создании объекта.*/

fun main() {
val tursdayWeather = DailyTemperature(
    _dayTemperature = 301,
    _nightTemperature = 290,
)
}

class DailyTemperature(val _dayTemperature: Int, val _nightTemperature: Int): String {
    val dayTemperatureKelvin = _dayTemperature
    val nightTemperatureKelvin = _nightTemperature
    val celsiumDayTemperature = kelvinToCelsium(dayTemperatureKelvin)
    val celsiumNightTemperature = kelvinToCelsium(nightTemperatureKelvin)
    val edit = "дневная температура: $celsiumDayTemperature\n" +
            "ночная температураЖ $celsiumNightTemperature"
    return "$edit"
}

fun kelvinToCelsium(temperatureKelvin: Int): Int {
    return temperatureKelvin - KELVIN_TO_CELSIUM
}

const val KELVIN_TO_CELSIUM = 275