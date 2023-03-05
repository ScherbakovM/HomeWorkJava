package Seminar5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> entryNames = new HashMap<>();
        Map<String, String> workerList = new HashMap<>(); // Список с сотрудниками.
        addList(workerList); // Заполняем
        ArrayList<String> WLValues = new ArrayList<>(); // будующий список с именами.
        String elem;
        for (var element : workerList.entrySet()) {
            elem = element.getValue();
            WLValues.add(elem);
        }
        entryMap(WLValues, entryNames);

    }
// Проверяем повторяющиеся значения, их кол-во "Collections.frequency" добавляем  в новый map 
// где ключ имя, имена не будут повторятья, как и ключи.

    public static  Map<String, Integer> entryMap (ArrayList<String> WLValues, Map<String, Integer> entryNames) {
        for (int index = 0; index < WLValues.size(); index++) {
            String chesk = WLValues.get(index);
            Integer entry = Collections.frequency(WLValues, chesk);
            entryNames.put(chesk, entry);
        }
        
        entryNames.entrySet().stream()  // сортировка
        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println); 
        
        
        return entryNames;

        

    }

// заполненый список сотрудников ключ фамилиия. 

    public static Map<String, String> addList(Map<String, String> arg) {
        arg.put("Иванов", "Иван");
        arg.put("Петрова", "Светалана");
        arg.put("Белова", "Кристина");
        arg.put("Мусина", "Анна");
        arg.put("Крутова", "Анна");
        arg.put("Юрин", "Иван");
        arg.put("Лыков", "Петр");
        arg.put("Чернов", "Павел");
        arg.put("Чернышов", "Петр");
        arg.put("Федорова", "Мария");
        arg.put("Светлова", "Марина");
        arg.put("Савина", "Мария");
        arg.put("Рыкова", "Мария");
        arg.put("Лугова", "Марина");
        arg.put("Владимирова", "Анна");
        arg.put("Мечников", "Иван");
        arg.put("Петин", "Петр");
        arg.put("Ежов", "Иван");
        return arg;
    }
}

// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с
// количеством повторений.
// Отсортировать по убыванию популярности Имени.