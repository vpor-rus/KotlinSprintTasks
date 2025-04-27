package org.example.lesson_1

import java.text.DecimalFormat

/*Объяви переменную с количеством секунд, которые Гагарин провел в космосе.

- Переведи в коде количество секунд(val seconds: Short = 6_480) в целые минуты и целые часы,
сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами.

Отправить решение
*/

fun main () {
    val seconds = 6_480
    val minutes = seconds / 60
    val hours = seconds / 3600
    val remainingSeconds = seconds - (minutes * 60)
    val remainingMinutes = minutes - (hours * 60)

    val decimalFormat = DecimalFormat("#00")

    println ("${decimalFormat.format(hours)}:${decimalFormat.format(remainingMinutes)}:${
        decimalFormat.format(remainingSeconds)}")
}