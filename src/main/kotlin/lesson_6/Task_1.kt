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
    val userPassword = readln()

    do {
        println("Для входа введите логин и пароль")
        var newLogin = readln()
        var newPassword = readln()
    } while (newLogin.equals(userLogin) == NON_ADMISSION_CRITERIA ||
        newPassword.equals(userPassword) == NON_ADMISSION_CRITERIA)

    println("Авторизация прошла успешно!")
}

const val NON_ADMISSION_CRITERIA = false