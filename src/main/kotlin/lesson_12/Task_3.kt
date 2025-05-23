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
     val tursdayWeather = WeatherDailys(
         dayTimeTemperature = 300,
         nightTemperature = 278,
         precipitation = true,
     )
    val existDayTemperature = celsiumTemperature(tursdayWeather.dayTimeTemperature)
    println(existDayTemperature)
    val existNightTemperature = celsiumTemperature(tursdayWeather.nightTemperature)
    println(existNightTemperature)
 }

class WeatherDailys(var dayTimeTemperature: Int, var nightTemperature: Int, var precipitation: Boolean)

fun celsiumTemperature(_temperature: Int): Int {
    val temperatureCelcium = _temperature - KELVIN_TO_CELSIUM
    return temperatureCelcium
}

const val KELVIN_TO_CELSIUM = 275