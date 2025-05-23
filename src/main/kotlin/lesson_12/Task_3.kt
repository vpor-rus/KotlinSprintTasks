package org.example.lesson_12

/*Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

- в этой задаче используй первичный конструктор без выделения памяти под свойства;
- поля должны быть объявлены и проинициализированы в теле класса;
- все поля с температурой должны иметь тип Int;
- программа не должна иметь других функций, кроме метода вывода информации о погоде.

В конструктор передается температура в Кельвинах. При обращении к полям с температурой
возвращаются данные в Цельсиях.

Cоздай объект с произвольными данными и выведи в консоль методом созданного класса.*/

fun main() {

}

class WeatherDailys {
    var dayTimeTemperature = 300
    var nightTemperature = 276
    var precipitation = false
}

fun formatKelvinToCelsius (_temperature: Int): Int {
    val temperatureKelvin = _temperature
    val temperatureCelcium = temperatureKelvin - KELVIN_TO_CELSIUM
    return temperatureCelcium
}

const val KELVIN_TO_CELSIUM = 275