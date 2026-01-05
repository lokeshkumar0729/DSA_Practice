package Arrays;
import java.util.*;

public class Arrays_demo {
    public static void main(String[] args) {
        // syntax for the array is
        // datatype[] varable_name = new datatype[size]
        // int[] arr; // declaration
        // arr = new int[5]; // actuall memory creation in the heap
       // arr = {1,2,3,4,5}   after declaration , it is not allowed to do like this
        //System.out.println(Arrays.toString(arr));
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the size of the Array:");
      int n = in.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the elements into the Array:");
      for (int i = 0 ; i < n; i++){
       arr[i] = in.nextInt();
    }
    System.out.print("The elements present in the array is :");
//    for (int i =0;i<n;i++){
//   System.out.print(arr[i]+" "); }

// System.out.print(Arrays.toString(arr));

// echanced for loop of arrays 
// syntax is 
// for (datatype reference varaible : array){ system.out.print(num);


    for(int num : arr){
    System.out.print(num + " "); // num represents the element in the array
    }
in.close();

    }
}
