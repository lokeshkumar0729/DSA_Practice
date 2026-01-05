package Sortings;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion_Sort {
       public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the Size of the Array:");
     int n = in.nextInt();
     int[] arr = new int[n];
     System.out.println("Enter The Elements into the Array");
     for(int i = 0; i < n; i++)
     arr[i] = in.nextInt();
     InsertionSort(arr);
    System.out.println(Arrays.toString(arr));
    in.close();
   }
   static void InsertionSort(int[] arr){
       for(int i =0; i<arr.length-1;i++){
    for(int j=i+1;j>0;j--){
       
    if(arr[j] < arr[j-1]){
    int temp = arr[j];
    arr[j] = arr[j-1];
    arr[j-1] = temp;
    
    }
    else 
    break;
    }
}
}
}
