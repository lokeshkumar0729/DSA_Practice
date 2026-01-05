package Arrays;

import java.util.*;
public class Array_vs_ArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = {"Lokesh","Kumar","bunny","Dhoni"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Swapna","Smiley","sai","anjani"));

        // to get the element from the index 
        System.out.println(str[0]);
        System.out.println(list.get(0));


        // to get size
        System.out.println(str.length);
        System.out.println(list.size());

        //add an element at the end of the array 
        // we cant do iit to norml array
        // we can do for array list
        list.add("Babe");
        System.out.println(list);


        // similary we cannt remove from array 
        // but we can do it from arrayList
        list.remove("anjani");
        System.out.println(list);


        list.set(3, "sailuuuu");
        System.out.println(list);

        System.out.println(list.contains("Swapna"));
        in.close();
    }
}
