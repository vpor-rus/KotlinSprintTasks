package org.example.lesson_10

/*Усовершенствуй игру, где пользователь и компьютер по очереди бросают кости.
Побеждает выбросивший наибольшее число. Теперь дай возможность пользователю играть
 до тех пор пока ему не надоест. В конце программа должна вывести сколько партий он выиграл.

- после первого раунда программа задает вопрос: “Хотите бросить кости еще раз? Введите Да или Нет”;
- программа в зависимости от ответа запускает новый раунд или заканчивает игру с
выводом количества выигрышных партий человека;
- в программе должно быть минимум 2 метода (для проведения раунда и для генерации значений брошенных кубиков);
- основная логика программы должна находиться в main(), а 2 другие функции будут вспомогательными.*/

fun main() {
    println("И пусть победит сильнейший")
    val playerWin = 0
    do {
        courseOfTheGame()
        print("Хотите бросить кости еще раз? Введите Да или Нет:  ")
        val answerGamer = readln()
    } while (nextGamerStep(answerGamer = answerGamer))

    print("Игрок победил: ")

}

fun randomeNumber(): Int {
    return (0..9).random()
}

fun courseOfTheGame() {
    val stepPlayer = randomeNumber()
    print("Ход игрока: $stepPlayer\n")
    val stepComputer = randomeNumber()
    print("Ход компьютера: $stepComputer\n")

     if (stepComputer < stepPlayer) {
         return println("Победил игрок")
    } else if (stepComputer > stepPlayer) {
         return println("Победил компьютер")
    } else {
         return println("Победила дружба")
    }
}

fun nextGamerStep(answerGamer: String?): Boolean {
    return answerGamer == "да"
}
