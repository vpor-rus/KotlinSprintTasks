package org.example.lesson_10

/*Напиши программу, которая генерирует пароли. Пароль должен состоять из последовательно
чередующихся цифр и специальных символов. Например, 4#4%2!.

- пользователь сам задает длину пароля;
- для генерации пароля должна быть отдельная функция, принимающая целочисленное значение длины пароля
 и возвращающая готовый пароль;
- пароль должен содержать цифры от 0 до 9, специальные символы: !"#$%&'()*+,-./ и пробел
(всего 16 спецсимволов).*/

fun main() {
    print("Введите необходимую длину пароля:  ")

        val listSimbols = mutableListOf<Char>()
        for (i in 1 ..numberSymbolsOfPassword()) {
            if (i % 2 != 0) {
                listSimbols.add(randomNumber())
            } else {
                listSimbols.add(randomSymbols())
            }
        }
        listSimbols.joinToString()

}
fun numberSymbolsOfPassword(): Int = readln().toInt()

fun randomNumber(): Char = ('0'..'9').random()

fun randomSymbols(): Char = (('!'..'/') + ' ').random()