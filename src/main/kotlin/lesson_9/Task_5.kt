package org.example.lesson_9

/*Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности).

- результат должен исключать повторы;
- список должен выводиться в алфавитном порядке;
- все элементы списка выведены в одну строку, разделяя слова запятыми;
- первый элемент должен быть распечатан с заглавной буквы.*/

fun main() {
    val listFiveIngredients = mutableListOf<String>()
    println("Введите пять названий ингредиентов (каждый по отдельности)")
    for (i in 1..5) {
        print("Введите ингредиент $i: ")
        val newIngredients = readln()
        listFiveIngredients.add(newIngredients)
    }

    listFiveIngredients.sort()
    listFiveIngredients[0] = listFiveIngredients[0].replaceFirstChar { it.uppercase() }
    print(listFiveIngredients)
}
