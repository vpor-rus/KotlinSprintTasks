package org.example.lesson_7

/*Создай программу, которая генерирует шестизначные пароли.
 Пусть пароль будет состоять из чередующихся цифр и строчных букв латинского алфавита
 (без специальных символов). Например, k5p6m2. Выведи сгенерированный пароль в консоль.*/

fun main() {
    val alphabeticSymbols = "abcdefghijklmnopqrstvwxyz"
    var numberCharacterString = "123456789"
    var superPuperPassword = ""
    for (counter in 1 .. 3) {
       var symbolWithAlphabet = alphabeticSymbols.random()
       var numberCharacter = numberCharacterString.random()
        superPuperPassword = "$superPuperPassword$symbolWithAlphabet$numberCharacter"
    }
    println("$superPuperPassword")
}

