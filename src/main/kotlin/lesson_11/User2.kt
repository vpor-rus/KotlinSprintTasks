package org.example.lesson_11

class User2 (
    val id: Int,
    val login: String,
    var password: String,
    val emailAdress: String,
    var bio: String? = null,
) {
    fun userInformation() {
        println("User2 id: $id")
        println("User2 login: $login")
        println("User2 password: $password")
        println("User2 email adress: $emailAdress")
        if (bio != null) {
            println("User2 bio: $bio")
        }
    }

    fun fillingInBio() {
        bio = readln()
    }

    fun changePassword() {
        print("Введите пароль для подтверждения: ")
        val examinerPassword = readln()
        if (examinerPassword == password) {
            print("Введите новый пароль: ")
            password = readln()
            println("Пароль изменен")
        }
    }
}