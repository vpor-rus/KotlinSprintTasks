package org.example.lesson_12

/*Продолжи усовершенствовать программу, теперь она должна рассчитывать средние значения температур
и считать количество дней с осадками за месяц.

Представь, что данные ты получаешь от датчиков. Сымитируй их поведение с помощью random.

- в функции main() создай список и добавь в него с помощью цикла 30 объектов класса, передав в конструкторы
случайные значения;
- извлеки из списка дневные и ночные температуры, используя функцию map, а также посчитай количество дней с осадками;
- вычисли средние значения дневных и ночных температур с помощью специальной extension-функции из
стандартной библиотеки;
- посчитай количество дней с осадками.

Выведи результаты в консоль.*/

fun main() {
    val diurnalTemperatureDay = 270 .. 315
    val numberInSeptember = 1..30
    for (i in numberInSeptember) {

    }
}

class diurnalWeather(_dayTemperature: Int, _nightTemperature: Int, _precipitation: Boolean = false,) {
    val dayTemperature = _dayTemperature
    val nightPrecipitation = _nightTemperature
    val precipitation = _precipitation
}

fun KelvinToCelcium(temperatureToKelvin: Int): Int {
    return temperatureToKelvin - KELVIN_TO_CELSIUM
}

const val KELVIN_TO_CELSIUM  = 275