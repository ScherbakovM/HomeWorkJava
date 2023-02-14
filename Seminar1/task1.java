package Seminar1;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
/**
 * task1 
 */
public class task1 {

  public static void main(String[] args) {
    System.out.print("Введите число N : ");
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.close();
    System.out.println("Сумма чисел от 1 до N  = " + summ(N));
    System.out.println("Произведение чисел от 1 до N  = " + prodNum(N));
    
  } 
  public static int summ(int arg){
    int sum = 0;
    for(int i = 1; i <= arg ; i++) {
      sum += i; 
    }
    return sum;
  } 

  public static int prodNum(int arg){
    int sum = 1;
    for(int i = 1; i <= arg ; i++) {
      sum *= i; 
    }
    return sum;
  } 

  static String getType(Object o) {
    return o.getClass().getSimpleName();
  }
}

//Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)