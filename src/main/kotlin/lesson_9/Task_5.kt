package org.example.lesson_9

/*Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности).

- результат должен исключать повторы;
- список должен выводиться в алфавитном порядке;
- все элементы списка выведены в одну строку, разделяя слова запятыми;
- первый элемент должен быть распечатан с заглавной буквы.*/

fun main() {
    val setFiveIngredients = mutableSetOf<String>()
    println("Введите пять названий ингредиентов (каждый по отдельности)")
    for (i in 1..5) { //добавить алгоритм который проверяет количество ячеек в mutableSet
        print("Введите ингредиент $i: ")
        val newIngredients = readln()
        setFiveIngredients.add(newIngredients)
    }

    setFiveIngredients.sorted() //обойти запрет на операции с ячейками set

    print(setFiveIngredients)
}
