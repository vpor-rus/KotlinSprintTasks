package org.example.lesson_7

/*Создай программу, которая генерирует шестизначные пароли.
 Пусть пароль будет состоять из чередующихся цифр и строчных букв латинского алфавита
 (без специальных символов). Например, k5p6m2. Выведи сгенерированный пароль в консоль.*/

fun main() {
    val alphabeticSymbols = ('a'..'z').random()
    val numberCharacterString = ('0'..'9').random()
    var superPuperPassword = ""

    for (counter in 1..3) {
    superPuperPassword = superPuperPassword + alphabeticSymbols + numberCharacterString
    }
    println(superPuperPassword)
}

