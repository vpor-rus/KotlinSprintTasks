package org.example.lesson_7

import kotlin.random.Random

/*Создай программу, которая генерирует шестизначные пароли. Пусть пароль будет состоять из чередующихся цифр
 и строчных букв латинского алфавита (без специальных символов). Например, k5p6m2. Выведи сгенерированный
 пароль в консоль.*/

fun main() {
    val randomAlphabet = ('a'..'z').toList().joinToString(separator = "")
    val randomeNumber = (1..9).toList().joinToString(separator = "")

    var counter = 3
    var characterSet = mutableListOf<Char>()

    do {
        val randomeOne = randomAlphabet.random()
        characterSet.add(randomeOne)
        val randomeTwo = randomeNumber.random()
        characterSet.add(randomeTwo)
        counter--
    } while (counter > 0)

    val editPassword = characterSet.joinToString(separator = "")
    println("$editPassword")
}
