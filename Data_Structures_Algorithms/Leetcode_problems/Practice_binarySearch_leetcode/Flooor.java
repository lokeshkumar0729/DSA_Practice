package Practice_binarySearch_leetcode;
import java.util.*;
public class Flooor {
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Celing of the giving number");
        System.out.print("Enter the size of the Array:");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements into the Array:");
        for (int i =0;i<arr.length;i++)
        arr[i] = in.nextInt();
        System.out.print("Enter the element to searched:");
        int num = in.nextInt();
         int index = binarysearch(arr,num);
         if(index != -1)
         System.out.println("The floor number for the number "+num+" is "+index);
         else {
        System.out.println("Element is out of bounds");
        }
        in.close();
    }
    static int binarysearch(int[] arr, int num){
    if(arr.length == 0)
    return -1;
    int ans = -1;
    int start =0;
    int end = arr.length -1;
    while (start <= end ) {
        int mid = start +(end-start)/2;
        if(num > arr[mid]){
        ans = mid;
        start = mid+1;}
        else if(num < arr[mid]){
       
        end = mid-1;
        
        }

        else 
        return arr[mid];
       
        
    }
    return (ans == -1 )? -1 : arr[ans];
}
}

