package Sortings;

import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sort {
      public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the Size of the Array:");
     int n = in.nextInt();
     int[] arr = new int[n];
     System.out.println("Enter The Elements into the Array");
     for(int i = 0; i < n; i++)
     arr[i] = in.nextInt();
     SelectionSort(arr);
    System.out.println(Arrays.toString(arr));
    in.close();
   }
  static void SelectionSort(int[] arr){
        int min = 0,i,j;
        for(i =0;i<arr.length-1;i++)   {
        for(j=i+1;j<arr.length;j++)  {
        if(arr[j] < arr[min])  {
        min = j;
    }
        if(arr[i]>arr[min])  {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min]=temp;
            }
        }
    }


     }
}
