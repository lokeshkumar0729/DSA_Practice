package Arrays;
import java.util.*;
public class Multi_dimensional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // the decalration and initilization of a2D Array is 
        // int[][] arr = new int[row size][col size];
        // col size is not mandatory
        System.out.println("2d Array Representation");
        System.out.print("Enter number of Rows:");
        int row = in.nextInt();
        int[][] arr = new int[row][];
        System.out.println("Enter the Elements into the Array");
        for (int i = 0; i < arr.length ; i++){
        System.out.print("Enter number of columns for row"+(i+1)+":");
        int col = in.nextInt();
        arr[i] = new int[col];  // we must allocate the memeory for the column, without allocatig , we cannot insert, it gives error
        for (int j =0; j < col; j++){
            arr[i][j] = in.nextInt();
        }
        }

        // for (int i =0 ; i< arr.length ; i++)
        // System.out.println(Arrays.toString(arr[i]));



        // this is another type to print elements from the array
        // for (int i =0 ; i < arr.length; i++){
        // for (int j =0 ; j < arr[i].length;j++){
        // System.out.print(arr[i][j]+" ");
        // }
        // System.out.println();
        // }




        //enhanced for loop
        for (int[] a : arr){
        System.out.println(Arrays.toString(a));
        }
        in.close();
    }
}
