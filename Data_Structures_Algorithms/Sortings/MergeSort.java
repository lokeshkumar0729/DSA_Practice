package Sortings;

import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 12, 4, 6, 7, 76, 78, 87, 12 };
        System.out.println(Arrays.toString(arr));
        int[] mix = mergeSort(arr);
        System.out.println(Arrays.toString(mix));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1){
            return arr;
        }

        int mid = (arr.length) / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }

    static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] > right[j]) {
                mix[k] = right[j];
               
                j++;
            } else {
                mix[k] = left[i];
                i++;
               
            }
             k++;
        }
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;

        }
        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}
