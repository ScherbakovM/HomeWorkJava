package Seminar2.Task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        System.out.print("Введите кол-во элементов массива: ");
        Scanner sc = new Scanner(System.in);
        int lengthArr = sc.nextInt();
        System.out.print("Введите максимальное значение числа в массиве: ");
        int maxNumber = sc.nextInt();
        int[] arr = createRandomArr(lengthArr, maxNumber);
        printArr(arr);
        bubbleSort(arr);
        sc.close();
        
    }
    // Создаём массив.
    public static int[] createRandomArr(int lengthArr,int maxNumber) {
        int[] list  = new int[lengthArr];
        Random random = new Random();
        for( int i = 0; i < list.length; i++ ) {
            list[i] = random.nextInt(maxNumber + 1);
            }
        return list;
    }
    
    // Печать массива.
    public static void printArr(int[] arr) {
        System.out.print("Ваш массив : ");
        for( int i = 0; i < arr.length; i++ ) {
            System.out.print( arr[i] + " ");
        }
    }
    // Сортируем
    public static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }   
                write(sortArr);
            }
        }
        addSeparator(" " );
        System.out.println("\nПосле сортировки : ");
        printArr(sortArr);
    }

    // Для записи в фаил

    public static void write (int[] args){
        String Newargs = Arrays.toString(args);
        File log = new File("Seminar2/Task1/bubleSortLog.txt"); // Указываем путь  к файлу
        
        try(FileWriter fw = new FileWriter(log, true))
        {   
            fw.write(Newargs + "\n");
            
        } catch (Exception e) {
            System.out.println("Запись не прошла");
        }    
        
    }

    public static void addSeparator (String arg ){
        File log = new File("Seminar2/Task1/bubleSortLog.txt"); // Указываем путь  к файлу
        
        try(FileWriter fw = new FileWriter(log, true))
        {   
            LocalDateTime logDate = LocalDateTime.now();
            fw.write(logDate + arg + "\n" + "\n");
            
        } catch (Exception e) {
            System.out.println("Запись не прошла");
        }    
        
    }

}