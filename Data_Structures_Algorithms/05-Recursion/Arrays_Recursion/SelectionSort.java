package Arrays_Recursion;

import java.util.Arrays;

public class SelectionSort {
   public static void main(String[] args) {
      int[] arr = { 4, 3, 2, 1 };
      System.out.println(Arrays.toString(arr));
      selectionSort(arr, arr.length, 0, 0);
      System.out.println(Arrays.toString(arr));
   }

   static void selectionSort(int[] arr, int row, int col, int max) {
      if (row == 0) {
         return;
      }
      if (col < row) {
         if (arr[max] < arr[col]) {
            max = col;
         }
         selectionSort(arr, row, col + 1, max);
      } 
     if(arr[max] > arr[row -1]){
      int temp = arr[max];
      arr[max] = arr[row -1];
      arr[row - 1] = temp;
   }
      else {
         selectionSort(arr, row - 1, 0, 0);
      }
   }

}
