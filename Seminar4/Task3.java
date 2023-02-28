package Seminar4;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Task3
 */
public class Task3 {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello!");
        int numOne = numOne();
        calc(numOne);
        
    }

    public static int calc (int arg) throws Exception{
        System.out.println("Какое действие необходимо сделать ?");
        System.out.println("Введите операцию +  -  * / ");
        System.out.println("q - выход, cancel - отмена последнего действия" );
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        int result = 0;
        switch (action) {
            case "+":
                System.out.print("Введите число : ");
                int numTwo = scanner.nextInt();
                result = arg + numTwo;
                System.out.println("ответ: " + result);
                arg = result;
                write(arg);
                return calc(arg);

            case "-":
                System.out.print("Введите число : ");
                numTwo = scanner.nextInt();
                result = arg - numTwo;
                System.out.println("ответ: " + result);
                arg = result;
                write(arg);
                return calc(arg);

            case "*":
                System.out.print("Введите число : ");
                numTwo = scanner.nextInt();
                result = arg * numTwo;
                System.out.println("ответ: " + result);
                arg = result;
                write(arg);
                return calc(arg);

            case "/":
                System.out.print("Введите число : ");
                numTwo = scanner.nextInt();
                result = arg / numTwo;
                System.out.println("ответ: " + result);
                arg = result;
                write(arg);
                return calc(arg);

            case "cancel":
                load();
                break;
            
            case "q":
            System.out.println("End");
                break;

            }
            

        return arg;      
    }
    
    public static int numOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        int numOne = scanner.nextInt();
        return numOne;      
    }
    // Записываем в 
    public static void write (int args){
        File log = new File("Seminar4/before.txt"); // Указываем путь  к файлу
        try(FileWriter fw = new FileWriter(log, true))
        {   
            fw.write(Integer.toString(args) + "\n");
            
        } catch (Exception e) {
            System.out.println("Запись не прошла");
        }    
        
    }
    // Возвращаем из before предыдущий сохранённый ответ.
    public static void load() throws Exception {
        File document = new File("Seminar4/before.txt"); // Указываем путь  к файлу
        FileReader fr = new FileReader( "Seminar4/before.txt" );
        Scanner scan = new Scanner(fr);
        LinkedList<Integer> res = new LinkedList<>();
        int i = 1;
        int log;
        //считываем фаил и записываем в линкед лист
        while (scan.hasNextLine()) { 
            log = Integer.parseInt(scan.nextLine());  
            res.add(log);
            i++;
        }
        //Удаляем последний элемент
        Deque<Integer> del = res;
        del.pollLast();
        System.out.println(res.get(res.size()-1));
        Integer newSize = res.size();
        //Перезаписываем фаил без него
        try(FileWriter fw = new FileWriter(document, false)){ 
            for (int index = 0; index < newSize; index++) {
                fw.write(Integer.toString(res.get(index)) + "\n");
            }    
        } 
        catch(Exception e){
            System.out.println("Запись не прошла " + e);
        } 
        scan.close();
        calc(res.get(res.size()-1));
    }
    
}


