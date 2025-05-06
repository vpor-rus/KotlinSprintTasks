package org.example.lesson_6

/*Создай простой таймер, который запрашивает у пользователя количество секунд,
которые нужно засечь. По истечении заданного времени, выведется сообщение в консоли:
 “Прошло N секунд”. Где N – количество секунд, введенных пользователем.
 Программа должна вставать на паузу.*/

fun main() {
    println("Напишите время отсечки в секундах")
    val requiredTime = readln().toInt()

    var timeInterval = START_COUNTDOWN
    while (timeInterval < requiredTime) {
        timeInterval = timeInterval + 1
        Thread.sleep(1000)
    }
    println("Прошло $timeInterval секунд(ы)")
}

const val START_COUNTDOWN = 0