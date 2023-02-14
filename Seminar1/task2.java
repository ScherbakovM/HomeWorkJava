//Вывести все простые числа от 1 до 1000
package Seminar1;

import java.util.List;

/**
 * task2
 */
public class task2 {

    public static void main(String[] args) {
    int n = 1000;
    String answer = "";
    for(int i = 2; i <= n; i++) {
    int k = 0;
        for(int j = 2; j <= n; j++){
            if(i % j == 0 && i != j)
             k = k + 1;
        }
    if(k == 0){
        answer =  answer + i + " ";
    }
    }
    System.out.print("Список всех простых чисел от  1 до 1000 :\n" + answer);
    }
}
//Вывести все простые числа от 1 до 1000