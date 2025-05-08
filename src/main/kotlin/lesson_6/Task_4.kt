package org.example.lesson_6

import kotlin.random.Random

/*Напиши небольшую консольную игру, в которой нужно угадать число в промежутке от 1 до 9.
Игроку дается 5 попыток, чтобы угадать это число.

 – если игрок угадывает число, выводится сообщение “Это была великолепная игра!”
  и программа завершает работу;
 – если не угадывает, то отображается "Неверно" или что-то на твое усмотрение и
 оставшееся количество попыток;
 – после истечения попыток выводится сообщение “Было загадано число N”.*/

fun main() {
    val happyNumer = (1 .. 9).random()
    println("Для проверки выведено значение рандомного числа $happyNumer")

    var interNumber: Int
    var counter = 5

    do {
        println("Введите число от 1 до 9")
        interNumber = readln().toInt()
        counter--
    }
    while (counter > 0 && interNumber != happyNumer)

    if ((counter in 1 .. 5) && (interNumber == happyNumer)) {
        println("Это была великолепная игра!")
    } else {
        println("Было загадано число $happyNumer")
    }
}

