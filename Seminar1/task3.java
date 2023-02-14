//Реализовать простой калькулятор (+ - / *)
package Seminar1;
import java.util.Scanner;

/**
 * task3
 */
public class task3 {

    public static void main(String[] args) {
        System.out.print("Введите число N : ");
        System.out.print("Введите первое число :");
        Scanner num1 = new Scanner(System.in);
        int a = num1.nextInt();
        System.out.print("Введите 1 для сложения, 2 вычитание, 3 умножение, 4 деление :");
        Scanner calc = new Scanner(System.in); 
        int b = calc.nextInt();
        System.out.print("Введите второе число :");
        Scanner num2 = new Scanner(System.in);
        int c = num2.nextInt();  
        int res = calculation(a,b,c);
        System.out.println(res);
    }

    public static int calculation(int arg1, int arg2, int arg3) {
        int result = 0;
        if(arg2 == 1){ 
           result = arg1 + arg3; 
           return result;
        }
        if(arg2 == 2){ 
            result = arg1 - arg3;
            return result;
         }

         if(arg2 == 3){ 
            result = arg1 * arg3;
            return result;
         }
         if(arg2 == 4){ 
            result = arg1 / arg3;
            return result;
         }
        return result;
    }

}

// Реализовать простой калькулятор (+ - / *)