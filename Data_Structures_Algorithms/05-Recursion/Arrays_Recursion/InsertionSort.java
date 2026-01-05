package Arrays_Recursion;

import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 10,784,37,3 };
        System.out.println(Arrays.toString(arr));
        insertionSort(arr, 1, 1);
        System.out.println(Arrays.toString(arr));

    }

    static void insertionSort(int[] arr, int row, int col) {
        if (row >= arr.length) {
            return;
        }
        if (col > 0) {
            if (arr[col] < arr[col - 1]) {
                int temp = arr[col];
                arr[col] = arr[col - 1];
                arr[col - 1] = temp;
            }
            insertionSort(arr, row, col-1);

        }
        else {
         
        insertionSort(arr, row+1, row+1);
        }
    }
}
