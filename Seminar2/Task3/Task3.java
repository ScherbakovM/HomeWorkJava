package Seminar2.Task3;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Введите слово для проверки является ли оно палиндромом: ");
        Scanner sc = new Scanner(System.in, "cp866");
        String stroka = sc.nextLine();
        sc.close();
        System.out.println(isPalindrome(stroka));
        
    }
    static boolean isPalindrome(String word) {
        StringBuffer buffer = new StringBuffer(word);
        buffer = buffer.reverse();
        String reversWord = buffer.toString();
        System.out.print(word);
        System.out.print(" = ");
        System.out.print(reversWord + " ?" + "\n");
        if(word.equals(reversWord)){
            return true;
        }
        else {
            return false;
        }
    }
}
