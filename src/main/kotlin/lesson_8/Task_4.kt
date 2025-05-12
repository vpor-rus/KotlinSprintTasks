package org.example.lesson_8

/*Представим, что мы получили массив ингредиентов. Программа должна распечатать
 весь список ингредиентов, затем заменить нужный ингредиент на новый по желанию пользователя.
  После этого программа должна показать обновленный список.

 – создай массив со списком ингредиентов и напечатай его в консоль;
 – запроси у пользователя информацию об ингредиенте, который он хочет заменить;
 – если пользователь ввел ингредиент, которого нет в списке, вывести соответствующее сообщение;
 – если есть, запроси ингредиент, который пользователь хотел бы добавить;
 – выведи обновленный список с сообщением: “Готово! Вы сохранили следующий список:
  [список_ингредиентов]”.
*/

fun main() {
    var arrayIngredients = arrayOf("Вода", "Соль", "Морковь", "Тофу", "Капуста")
    for (i in arrayIngredients) {
        println("Ингридиент ${arrayIngredients.indexOf(i) + 1} $i")
    }
    print("Какой ингредиент вы хотите изменить?\n Какой продукт вы хотите заменить: ")
    val nameIngredient = readln()

    if (arrayIngredients.contains(nameIngredient)) {
        print( "Ингридиент $nameIngredient есть в списке\n" +
                "Какой продукт вы хотите добавить: ")
        val newNameIngredient = readln()
        val indexOfIngredients = arrayIngredients.indexOf(nameIngredient)
        arrayIngredients.set(indexOfIngredients, newNameIngredient)

        println("Готово! Вы сохранили следующий список:")
        for (i in arrayIngredients) {
            println("${arrayIngredients.indexOf(i) + 1} $i")
        }
    } else {
        println("Продукта $nameIngredient нет в списке")
    }
}