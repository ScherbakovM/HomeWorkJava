package Seminar4;
import java.util.LinkedList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> mylist =  new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Введите число для добавления в список");
            System.out.print("Для разворота списка введите reverse: ");
            String useEnter = sc.nextLine();

            if (isDigit(useEnter) == false) {
                if(useEnter.equals("stop")) {
                    System.out.println("Ваш массив " + mylist);
                    break;
                }
                else if(useEnter.equals("reverse")) {
                    if(mylist.isEmpty() == false){
                    reverse(mylist);
                    }
                    else{
                        System.out.println("К сожалению писок пуст, сначала заполните список.");
                    }
                    break;
                }
                else if (useEnter.isEmpty()) {
                    System.out.println("Пустой ввод");
                }
                else {
                System.out.println("Вы ввели не число!");
                }
            } 
            
            else if (isDigit(useEnter) == true){
                mylist.add(Integer.parseInt(useEnter));
                System.out.println(mylist);
            }
                               
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
    public static LinkedList<Integer> reverse(LinkedList<Integer> arg) {
        System.out.println("reverse");
        LinkedList<Integer> Numbers = new LinkedList<>();
        for(int i = arg.size() - 1; i >= 0; i--){
            Numbers.add(arg.get(i));
            arg.remove(i);
        }
        for (int i = 0; i < Numbers.size(); i++) {
            arg.add(Numbers.get(i));
        }
        System.out.println(arg);
        return arg;
    }

}
