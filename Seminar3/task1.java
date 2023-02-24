package Seminar3;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import javax.sound.midi.Soundbank;

import Lection.list;

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {

        ArrayList<Integer> numsList = new ArrayList<Integer>(10);
        Random randDigit = new Random(100);
        for (int i = 0; i < 10; i++) {
           numsList.add(randDigit.nextInt(100));
           System.out.print(numsList.get(i) + " ");   
        }
        System.out.println("");
        System.out.println( "Размер массива: " + numsList.size() + " элементов.");
        removeElem(numsList);
        
    }

// Метод который удаляет четные числа 
    public static ArrayList<Integer> removeElem(ArrayList<Integer> numList) {
        for (int i = 0; i < numList.size(); i++) {
            if(numList.get(i) % 2 == 0){
                numList.remove(i);
                return removeElem(numList);
            }     
        }
        System.out.print("После удаления четных чисел массив : ");
        int size = numList.size();
        System.out.println(numList + " Колл-во элментов - " + size);
        return numList;
    }
}
//1) Пусть дан произвольный список целых чисел, удалить из него четные числа