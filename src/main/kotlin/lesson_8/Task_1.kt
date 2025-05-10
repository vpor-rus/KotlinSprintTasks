package org.example.lesson_8

/*Скрипт считает количество просмотров рекламы за день. Напиши программу,
 которая сохраняет в массив данные просмотров за неделю
  (числа использовать на свое усмотрение).
  Каждая ячейка хранит количество просмотров за день. Имея массив с данными,
  нужно посчитать сколько всего было просмотров за неделю.
  Результат вычислений выведи в консоль.*/

fun main() {
    val mondayView = 1
    val tuesdayView = 2
    val wednesdayView = 3
    val thursdayView = 4
    val fridayView = 5
    val mostlyPorno = 101010
    val sundayView = 7

    val weeklyStatistic = arrayOf(mondayView, tuesdayView, wednesdayView, thursdayView, fridayView,
        mostlyPorno, sundayView)

    val weeklyView = weeklyStatistic[0] + weeklyStatistic[1] + weeklyStatistic[2] +
            weeklyStatistic[3] + weeklyStatistic[4] + weeklyStatistic[5] + weeklyStatistic[6]
    println(weeklyView)
}