package org.example.lesson_11

/*Реализовать класс работы форума (Forum). Для реализации создай дополнительные классы для сущностей
“Член форума” (с полями userId и userName) и “Сообщение форума” (с полями authorId и message).

Примени паттерн “Строитель” для создания пользователей и сообщений форума. Напрямую объекты не создаются,
 логика должна быть инкапсулирована внутри методов класса.

- createNewUser() создает новых пользователей, принимая имя пользователя. Метод сохраняет нового пользователя
 в общий список и одновременно возвращает новый объект. Генерация id-шников новых пользователей происходит внутри;
- createNewMessage() создает сообщения, принимая id пользователя. Сообщения создаются только если такой
пользователь есть на форуме;
- printThread() печатает в консоль все сообщения добавленные на форум в формате:

    автор: сообщение
    автор: сообщение

Создай экземпляр Forum и продемонстрируй его работу, добавив двух пользователей и по два сообщения от
каждого пользователя.*/

fun main() {
    val forum = UserInForumBuilder().apply {
       setUserName("Телепузик")
    }.build()

    val messageInForum = MessageForumBuilder().apply {
                setMessage("Привет вам из 2025")
    }.build()

    println("$forum : $messageInForum")
}

class MessageForum(val autorId: Int, val message: String)

class MessageForumBuilder {
    var autorId: Int = 0
    var message: String = ""

    fun setAutorId(autorId: Int) = apply { this.autorId = autorId }
    fun setMessage(message: String) = apply { this.message = message }

    fun build() = MessageForum(autorId, message)
}

class UserInForum(val userId: Int, val userName: String)

class UserInForumBuilder {
    var userId: Int = 0
    var userName: String = ""

    fun setUserId(userId: Int) = apply { this.userId = userId }
    fun setUserName(userName: String) = apply { this.userName = userName }

    fun build() = UserInForum(userId, userName)
}
// У меня в результатах абракадабра:
// org.example.lesson_11.UserInForum@66a29884 : org.example.lesson_11.MessageForum@4769b07b
// Что прочитать что бы разобраться?
// Я понимаю что это адреса ячеек, не могу понять как вывести их значения.





