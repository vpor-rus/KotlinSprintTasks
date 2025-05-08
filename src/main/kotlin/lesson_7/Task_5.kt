package org.example.lesson_7

/*Создай программу, которая генерирует более сложные пароли.

– пароль должен содержать цифры, строчные и заглавные буквы
- должны присутствовать все три вида символов;
– цифры и буквы должны располагаться в случайном порядке;
– длина пароля должна задаваться пользователем;
– минимальная длина пароля 6 символов.*/

fun main() {
    val upperAlphabeticSymbols = ('A'..'Z').random()
    val lowerAlphabeticSymbols = ('a'..'z').random()
    val numberSymbols = ('0'..'9').random()
    var oneSymbol: String
    var passwordEdit=mutableListOf<String>()

    println("Введите необходимую длину пароля.\n Напоминаю, не менее 6 символов")
    val lenghtPassword = readln().toInt()

    for (i in 1 .. lenghtPassword) {
        oneSymbol = ("$upperAlphabeticSymbols$lowerAlphabeticSymbols$numberSymbols").random().toString()
     passwordEdit.add(oneSymbol)
    }
    passwordEdit.forEach { it: String -> print(it) }
}