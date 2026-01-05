package Sortings;
import java.util.*;
public class Bubble_Sort {
    // Bubble  sort is also known as sinking sort and exchange sort
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the Size of the Array:");
     int n = in.nextInt();
     int[] arr = new int[n];
     System.out.println("Enter The Elements into the Array");
     for(int i = 0; i < n; i++)
     arr[i] = in.nextInt();
     BubbleSort(arr);
    System.out.println(Arrays.toString(arr));
    in.close();
   }
   
    static void BubbleSort(int[] arr){
    for(int i = 0 ; i<arr.length;i++){
        int swap = 0;
    for(int j = 0;j<(arr.length-i-1);j++){
    if(arr[j] > arr[j+1]){
    int temp = arr[j];
    arr[j] = arr[j+1];
    arr[j+1]= temp;
    swap++;
    }
    }
    if(swap == 0)
    break;
    }
    
    }
}
