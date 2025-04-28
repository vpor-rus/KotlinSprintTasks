package org.example.lesson_3

/*Девушка по имени Андреева Татьяна Сергеевна в 22 года вышла замуж за Сидорова,
и поменяла фамилию. О ней есть запись в одном из государственных приложений.
 Приложение отслеживает изменения персональных данных граждан.

Выведи в консоль данные на момент когда ей было 20
и на момент когда ей было 22 в формате [ФИО, возраст].
Все части ФИО и возраст изначально хранятся в отдельных переменных.*/

fun main () {

    var age: Int

 age = 20
    println("$FIRST_NAME_MISS $SECOND_NAME $MIDDLE_NAME $age")

 age =22
    println("$FIRST_NAME_MISSIS $SECOND_NAME $MIDDLE_NAME $age")
}
val SECOND_NAME = "Татьяна"
val MIDDLE_NAME = "Сергеевна"
val FIRST_NAME_MISS = "Андреева"
val FIRST_NAME_MISSIS = "Сидорова"