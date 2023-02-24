package Seminar3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//2) Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> numsList = new ArrayList<Integer>(10);
        Random randDigit = new Random(100);
        for (int i = 0; i < 10; i++) {
           numsList.add(randDigit.nextInt(100));
           System.out.print(numsList.get(i) + " ");   
        }
        System.out.println("");
        System.out.println("Максимальное значение : " + Collections.max(numsList));
        System.out.println("Минимальное значение : " + Collections.min(numsList));
        midl(numsList);
    }

    public static void midl(ArrayList<Integer> arr) {
        int summ = 0;
        int midl = arr.size();
        for (int index = 0; index < arr.size(); index++) {
            summ += arr.get(index);
        }
        System.out.println("Среднее арифметическое : " + summ / midl);    
    }
}
