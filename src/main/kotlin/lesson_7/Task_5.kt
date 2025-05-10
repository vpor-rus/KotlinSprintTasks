package org.example.lesson_7

/*Создай программу, которая генерирует более сложные пароли.

– пароль должен содержать цифры, строчные и заглавные буквы
- должны присутствовать все три вида символов;
– цифры и буквы должны располагаться в случайном порядке;
– длина пароля должна задаваться пользователем;
– минимальная длина пароля 6 символов.*/

fun main() {
    val upperAlphabeticSymbols = ('A'..'Z').toList().joinToString(separator = "")
    val lowerAlphabeticSymbols = ('a'..'z').toList().joinToString(separator = "")
    val numberSymbols = ('0'..'9').toList().toList().joinToString(separator = "")


    println("Введите необходимую длину пароля.\n Напоминаю, не менее 6 символов")
    val lenghtPassword = readln().toInt()
    var editPassword = mutableListOf<Char>()
    //ниже набор обяхательных 6ти символов
    for (i in 1..2) {
        val firstSimbol = upperAlphabeticSymbols.random()
        editPassword.add(firstSimbol)
        val secondSimbol = lowerAlphabeticSymbols.random()
        editPassword.add(secondSimbol)
        val thirdSimbol = numberSymbols.random()
        editPassword.add(thirdSimbol)
    }
    //донабор символов более 6ти
    for (i in 1..(lenghtPassword - REQUIRED_MINIMUM_SYMBOLS)) {
        editPassword.add(
            (upperAlphabeticSymbols + lowerAlphabeticSymbols + numberSymbols).random()
        )
    }
    println(editPassword.joinToString(separator = ""))
}

const val REQUIRED_MINIMUM_SYMBOLS = 6