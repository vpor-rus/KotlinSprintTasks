package org.example.lesson_4

/*На сайте ресторана есть онлайн бронирование.
Бронирование доступно, когда есть свободные столики.
Всего в ресторане 13 столов и их количество всегда неизменно.
На сегодня забронированы все столики, а на завтра 9.

Напиши программу, которая сообщает информацию о бронировании в момент запроса,
путем сравнения данных о свободных столах с данными о столах в ресторане.

 – Создать переменные с количеством забронированных столов на сегодня и на завтра;
 – Вывести в консоль сообщение о доступности столиков в одном println();
 – Каждое сообщение с новой строки (НЕ использовать многострочный вывод (“”” “””));
 – Формат сообщений такой:
[Доступность столиков на сегодня: true/false],
[Доступность столиков на завтра: true/false].*/

fun main() {
    var reservedTables: Int

    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9

    reservedTables = reservedTablesToday

    var resultReserve: Boolean = reservedTables !== NUMBER_OF_TABLES
    println("$resultReserve")

    reservedTables = reservedTablesTomorrow

    resultReserve= reservedTables !== NUMBER_OF_TABLES
    println("$resultReserve")

}

const val NUMBER_OF_TABLES = 13