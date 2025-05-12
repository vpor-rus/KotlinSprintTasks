package org.example.lesson_8

/*Напиши программу, которая должна создавать массив из определенного количества ингредиентов,
которые будет вводить пользователь.

- элементы вводятся по одному;
- перед вводом элементов сначала запрашивается количество планируемых ингредиентов;
- запрещено использовать список или динамический массив.

Выведи полученные ингредиенты в консоль через запятую.*/

fun main() {
    print("Введите количество продуктов в списке: ")
    var numberIngredients = readln().toInt()
    var arrayIngredients = arrayOf<String>()
    var indexArrayIngredients = 0

    do {
        print("Введите наименование ингридиента: ")
    val newIngredients = readln()
      arrayIngredients[indexArrayIngredients++] = newIngredients
        numberIngredients--
    } while ( numberIngredients > 0)

    for (i in arrayIngredients) {
        println("Ингридиент ${arrayIngredients.indexOf(i) + 1} $i")
    }
}