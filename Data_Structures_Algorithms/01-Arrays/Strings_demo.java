package Arrays;
import java.util.*;
public class Strings_demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This is a string Array");
        System.out.print("Enter the Size of the String Array:");
        int n = in.nextInt();
        in.nextLine();
        String[] str = new String[n];
        System.out.println("ENter the Strings into the Array:");
        for(int i=0;i<str.length;i++){
        str[i]=in.nextLine();
        }
        System.out.println("The Srrings inside the Array is :");
        for (String s : str){
        System.out.println(s);
        in.close();
        }
    }
}
