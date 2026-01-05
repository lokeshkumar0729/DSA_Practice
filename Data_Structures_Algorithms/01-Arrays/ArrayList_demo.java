package Arrays;
import java.util.*;
public class ArrayList_demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax for the Array List is 
        // ArrayList<Wrapper Class> varable_name = new ArrayList<>(intitial capacity);
        // we use it when we dont know the size of the array
        ArrayList<Integer> list = new ArrayList<>();
       for (int i =0; i<5;i++)
       list.add(in.nextInt());
       
        System.out.println(list);
        in.close();

    }
}
