package Lection;

public class getType {
    public static void main(String[] args) {
        Object o = 1;
        GetType(o);
        
    }
    static void GetType(Object obj){
        System.out.println(obj.getClass().getName());
    }
    
}
