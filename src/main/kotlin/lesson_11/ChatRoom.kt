package org.example.lesson_11

class ChatRoom(
    val cover: String,
    val name: String,
    val listOfParticipiants: MutableMap<String, String>,
) {

    fun addNewUser() {
        val newAvatarNikName = readln() //имитация загрузки аватарки с никнеймом
        val newStatus = changeNaimAndStatus(TALKING, MICROPHONE_IS_ON, USER_IS_MUTED)
        listOfParticipiants.put(newAvatarNikName, newStatus?: "нет статуса")
    }



    fun changeNaimAndStatus() {
        val whatNikNaimNeedChange = readln()
        for (i in listOfParticipiants) {
            if (i == whatNikNaimNeedChange) {
                print("Введите новый логин: ")
                val newNikname = readln()
                print("Выберите новый статус: ")
                val newStatus = changeNaimAndStatus(TALKING, MICROPHONE_IS_ON, USER_IS_MUTED)
            }
        }
    }

    private fun changeNaimAndStatus(talking: String, microphoneIsOn: String, userIsMuted: String): String? {
        val _changeNameStatus: String?
        print("введите вариант статуса: \n" +
                "1-разговаривает\n" +
                "2-микрофон выключен\n" +
                "3-пользователь заглушен\n")
        val variantStatus = readln()
        when(variantStatus){
            "1" -> _changeNameStatus = talking
            "2" -> _changeNameStatus = microphoneIsOn
            "3" -> _changeNameStatus = userIsMuted
            else -> _changeNameStatus = null
        }
        return _changeNameStatus
    }
}

const val TALKING = "разговаривает"

const val MICROPHONE_IS_ON = "микрофон выключен"

const val USER_IS_MUTED= "пользователь заглушен"