package org.example.lesson_6

/*На этапе авторизации в приложении пользователь, не имея аккаунта, выбрал регистрацию.
 Нужно создать блок программы, который сначала предлагает создать логин и пароль,
 затем запрашивает их, чтобы войти в приложение.

Если логин или пароль введены неверно – данные запрашиваются заново. Если данные верны,
 выводится сообщение – “Авторизация прошла успешно”.*/

fun main() {
    println("Придумайте логин")
    val userLogin = readln()
    println("Придумайте пароль")
    val  userPassword = readln()

    println("Для входа в систему введите ваш логин и пароль\n" +
            "Введите логин")
    var newLogin = readln()
    while ((newLogin.equals(userLogin)) == NON_ADMISSION_CRITERIA ) {
        println("Логин не верен, введите правильный")
        newLogin = readln()
    }
    println("Введите пароль")
    var newPassword = readln()
    while (newPassword.equals(userPassword) == NON_ADMISSION_CRITERIA) {
        println("Пароль не верен, введите правильный")
        newPassword = readln()
    }
    println("Авторизация прошла успешно!")
}
const val NON_ADMISSION_CRITERIA = false