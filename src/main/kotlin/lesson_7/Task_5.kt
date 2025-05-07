package org.example.lesson_7

/*Создай программу, которая генерирует более сложные пароли.

– пароль должен содержать цифры, строчные и заглавные буквы
- должны присутствовать все три вида символов;
– цифры и буквы должны располагаться в случайном порядке;
– длина пароля должна задаваться пользователем;
– минимальная длина пароля 6 символов.*/

fun main() {
    val upperAlphabeticSymbols = "ABCDEFGHIJKLMNOPQRSTVWXYZ"
    val lowerAlphabeticSymbols = "abcdefghijklmnopqrstvwxyz"
    val numberSymbols = "0123456789"
    var passwordEdit= ""

    println("Введите необходимую длину пароля.\n Напоминаю, не менее 6 символов")
    val lenghtPassword = readln().toInt()
    for (i in 1 .. lenghtPassword) {
        val oneSymbol = ("${upperAlphabeticSymbols.random()}${lowerAlphabeticSymbols.random()}" +
                "${numberSymbols.random()}").random()
     passwordEdit = passwordEdit + oneSymbol
    }
    println("$passwordEdit")
}