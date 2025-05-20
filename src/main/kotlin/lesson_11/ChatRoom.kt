package org.example.lesson_11

class ChatRoom(
    val cover: String,
    val name: String,
    val listOfParticipiants: MutableMap<String, String>,
) {
    fun addNewUser() {
        val newAvatarNikName = readln() //имитация загрузки аватарки с никнеймом
        val newStatus = readln()
        listOfParticipiants.put(newAvatarNikName, newStatus)
    }
}