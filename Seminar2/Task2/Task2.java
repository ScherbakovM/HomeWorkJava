package Seminar2.Task2;
import java.io.File;
import java.util.Scanner;
/**
 * Task2
 */

public class Task2 {
    public static void main(String[] args) {
    String stroka = sb();
    String[] words = stroka.split(" ");
    CreateMD(words);
    }

    public static String sb() {
        String creator = "";
        File filePath = new File("Seminar2/Task2/text.txt");
        try {
            Scanner sc = new Scanner(filePath);
            while(sc.hasNextLine()){
                creator += sc.nextLine() + " ";
                creator = creator.replace(',', ':');
                creator = creator.replace(':', ' ');
            }}
        catch (Exception e) {     
            System.out.println("Что то пошло не так !");
        }
        return creator;  
    }
    public static void CreateMD(String[] arr) {
            String s = "Студент " + arr[1] + " получил " + arr[3] + " по предмету " + arr[5];
            s = s.replace("\"", "");
            System.out.println(s);
            String k = "Студент " + arr[7] + " получил " + arr[9] + " по предмету " + arr[11];
            k = k.replace("\"", "");
            System.out.println(k);
        }
}