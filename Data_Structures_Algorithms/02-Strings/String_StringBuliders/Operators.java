package String_StringBuliders;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        // System.out.println('a'+'b'); // it converting into acii values while it is in char
        // System.out.println("a"+"b"); // it is a string
        // System.out.println('a'+3); // it converting into a integer
        // System.out.println((char)('a'+3)); // here we are type casting a inter into character
        // System.out.println("Lokesh" + new ArrayList<>());
        // System.out.println("Lokesh" + new Integer(67));
        // // The plus Operator is used , if it is object it calls the tostring method, if it is an array , it call array list method
        // System.out.println(new Integer(90)+ new ArrayList<>()); // we cannot use like this , it must contains the strings
        System.out.println(new Integer(90)+ ""+new ArrayList<>()); // we cannot use like this , it must contains the strings
    }
}
