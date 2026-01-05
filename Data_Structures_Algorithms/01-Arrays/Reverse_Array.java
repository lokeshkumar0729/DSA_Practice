package Arrays;
import java.util.*;
public class Reverse_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements into the Array");
        for(int i =0; i<arr.length;i++)
        arr[i] = in.nextInt();

        System.out.println("The Original Array");
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        in.close();
    }
    static void reverse(int[] arr){
    int start = 0;
    int end = arr.length-1;
    while(start < end){
    swap(arr,start,end);
    start++;
    end--;
    }
    System.out.println("The Array after the reversing is:");
    System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int start , int end){
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    }
}
