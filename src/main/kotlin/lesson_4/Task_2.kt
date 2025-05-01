package org.example.lesson_4

/*При работе на таможенном терминале важно точно определить категорию каждого груза.
Напиши программу, которая проверяет, соответствует ли груз категории "Average".
Эта категория имеет следующие параметры: вес от 35 кг (не включительно)
до 100 кг (включительно), и объем меньше 100 литров (не включительно).

Создай программу, которая отображает соответствие данных груза категории "Average".
Вывод программы может выглядеть так: "Груз с весом 42 кг и объемом 120 л
соответствует категории 'Average': false".

- укажи предварительно заданные параметры категории;
- проверь, соответствуют ли следующие грузы категории "Average": 20 кг / 80 л и 50 кг / 100 л;
- сделай сравнение непосредственно внутри println() и без использования диапазонов.*/

fun  main() {
val  weightPassingCargo = 42
val voliumPassingCargo = 120

val customsGivesTheGoAhead: Boolean = weightPassingCargo > MIN_WEIGHT_AVERAGE && weightPassingCargo < MAX_WEIGHT_VOLUME_AVERAGE &&
voliumPassingCargo < MAX_WEIGHT_VOLUME_AVERAGE

println("Груз с весом 42 кг и объемом 120 л соотвествует: $customsGivesTheGoAhead")
}

const val MIN_WEIGHT_AVERAGE = 35
const val MAX_WEIGHT_VOLUME_AVERAGE = 100
