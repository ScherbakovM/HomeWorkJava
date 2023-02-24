package Lection;
import java.util.ArrayList;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList<String>(); // с указанием типа нельзя добавить обьекты другого класса.
        ArrayList lst = new ArrayList(); // Без указания данные храняться с типом object
        lst.add(1234);

        System.out.println("Элемент для добавления в массив: ");
        Scanner sc = new Scanner(System.in, "cp866");
        String a = sc.nextLine();
        lst.add(a); 
        
        for (Object o : lst) {
            System.out.println(o);
        }
    }
    
}
