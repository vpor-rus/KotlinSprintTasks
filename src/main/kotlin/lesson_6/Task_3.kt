package org.example.lesson_6

/*Нужно усовершенствовать таймер из задачи 6-2 так,
чтобы он показывал пользователю сколько секунд осталось в процессе отсчета.

 – каждую секунду выводить сообщение такого формата: “Осталось секунд: N”;
 – по истечении таймера выводить сообщение “Время вышло”;
 – таймер должен быть написан, используя цикл while.*/

fun  main() {
    println("Напишите время отсечки в секундах")
    val requiredTime = readln().toInt()

    var timeInterval = START_COUNTDOWN
    while (timeInterval < requiredTime) {
        println("Осталось секунд(а) ${requiredTime - timeInterval}")
        timeInterval = timeInterval + 1
        Thread.sleep(1000)
    }
    println("Время вышло")
}

const val START_COUNTDOWN = 0
