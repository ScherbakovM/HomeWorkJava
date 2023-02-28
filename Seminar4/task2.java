package Seminar4;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Заполните список числами: ");
    LinkedList<Integer> LinList =  new LinkedList<>();
    addLinList(LinList);
    action(LinList);
    
}

    public static LinkedList<Integer> addLinList (LinkedList<Integer> arg) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Bведите число для добавления в список");
            System.out.println("Введите stop для продолжения:");     
            String elem = scan.nextLine().toLowerCase();
            if(isDigit(elem) == true){
            arg.add(Integer.parseInt(elem));
            System.out.println(arg);
            addLinList(arg);
            }
            else if(elem.equals("stop")){

                System.out.println("Ваш список : " + arg);
            }
            else if (isDigit(elem) == false){
            System.out.println("введено не число");
            continue; 
            }
            return arg;   
        }
        
    }
     // Проверка на число
     public static boolean isDigit(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static LinkedList<Integer> queAdd (LinkedList<Integer> arg) {
        Scanner sc = new Scanner(System. in);
        System.out.println("Введите элемент: ");
        Integer newElem = sc.nextInt();
        Queue<Integer> q = arg;
        q.add(newElem);
        System.out.println(arg);
        return arg;
    }
    public static LinkedList<Integer> dequeDel (LinkedList<Integer> arg) {
        Deque<Integer> q = arg;
        q.pollFirst();
        System.out.println(arg);
        return arg;
    }

    public static LinkedList<Integer> action(LinkedList<Integer> arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Поместить элемент в конец списка введите  - 1");
        System.out.println("Чтобы вернуть первый элемент и удалить его  - 2");
        Integer userEntered = sc.nextInt();
        switch (userEntered) {
            case 1:        
                queAdd(arg);  
                return action(arg);
            case 2:
                System.out.println("Вы удалили : " + arg.get(0));  
                dequeDel(arg);
                return action(arg);        
    }
        return arg;
}

}
