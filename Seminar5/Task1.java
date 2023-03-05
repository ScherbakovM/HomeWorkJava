// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера 2) Вывод всего

package Seminar5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Map<String, LinkedList<String>> phoneBook = new HashMap<>();
        LinkedList<String> num = new LinkedList<>();
        action(phoneBook, num);
    }

    public static void action(Map<String, LinkedList<String>> phoneBook, LinkedList<String> num) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------");
        System.out.println("1 - Добавление номера");
        System.out.println("2 - Вывод телефонной книги");
        System.out.println("3 - Выход");
        System.out.println("--------------");
        int arg = sc.nextInt();
        switch (arg) {
            case 1:
                add(phoneBook, num);
                sc.close();
                break;
            case 2:
                print(phoneBook);
                action(phoneBook, num);
            case 3:
                break;
            default:
                break;
        }
    }

    public static void add(Map<String, LinkedList<String>> arg, LinkedList<String> num) {
        Scanner scanner = new Scanner(System.in, "cp866");
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию");
        String surName = scanner.nextLine();
        System.out.println("Введите ваш номер телефона ");
        String phoneNumber = scanner.nextLine();
        String key = surName + " " + name;
        if (arg.containsKey(key)) {
            System.out.println(key + " есть в базе, добавить еще номер ? ");
            System.out.println("1 - Да");
            System.out.println("2 - Нет");
            int choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    arg.get(key).add(phoneNumber);
                    action(arg, num);
                    break;

                case 2:
                    action(arg, num);
                    break;

                default:
                    action(arg, num);
                    break;
            }
        } else {
            LinkedList<String> value = new LinkedList<>();
            value.add(phoneNumber);
            arg.put(key, value );
            action(arg, num);
        }

    }

    public static void print(Map<String, LinkedList<String>> arg) {
        for (var element : arg.entrySet()) {
            System.out.println(element.getKey() + " " + element.getValue());
        }
    }
}
