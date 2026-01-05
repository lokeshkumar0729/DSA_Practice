package Arrays;
import java.util.*;
public class Array_Even_Odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements into the Array");
        for(int i =0; i<arr.length;i++)
        arr[i] = in.nextInt();
      
        System.out.println(Arrays.toString(arr));
        int count=0;
        for(int i =0; i < arr.length;i++)
        {
        int b = arr[i];
        int c = String.valueOf(b).length();
        if(c % 2 == 0){
        count++;
        }
        }
        System.out.println(count);
        in.close();

    }
}
