package org.example.lesson_8

/*Напиши программу, которая должна создавать массив из определенного количества ингредиентов,
которые будет вводить пользователь.

- элементы вводятся по одному;
- перед вводом элементов сначала запрашивается количество планируемых ингредиентов;
- запрещено использовать список или динамический массив.

Выведи полученные ингредиенты в консоль через запятую.*/

fun main() {
    print("Введите количество ингридиентов: ")
    var numberIngredients = readln().toInt()

   while (numberIngredients > 0) {
       print("Введите ингредиент: ")
       val newIngredient = readln()
       var arrayIngredients = arrayOf(newIngredient)
       numberIngredients--
    }
    println(arrayI)
}