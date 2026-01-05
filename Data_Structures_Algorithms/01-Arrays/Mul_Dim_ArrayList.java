package Arrays;
import java.util.*;

public class Mul_Dim_ArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();  // createing a multidimensional array
        for (int i =0; i < 3; i++)
        list.add(new ArrayList<>()); // initailizing the rows into the array , without allocating the memory into that, we cant access the array and cant input 

        for(int i=0; i<3;i++){
        for(int j =0;j<3;j++){
        list.get(i).add(in.nextInt()); // get is used here , accessng the index 0 from the arraylist, it menas 0 indexed array

        }}
        System.out.println(list);
        in.close();
    }
}
