package Lection1;

import java.lang.ProcessBuilder.Redirect.Type;

import org.w3c.dom.TypeInfo;

/**
 * lection
 */
public class lection {
    public static void main(String[] args) {
        var a  = 123;
        var b = 124;
        System.out.println(getType(a)); //Проверка типа данных;
        System.out.println(Byte.MAX_VALUE);
    }    

// Для определения  типа данных
static String getType(Object o) {
    return o.getClass().getSimpleName();
}
}


// Типы данных

// byte
// short
// int
// long
// float
// double
// boolean
// char