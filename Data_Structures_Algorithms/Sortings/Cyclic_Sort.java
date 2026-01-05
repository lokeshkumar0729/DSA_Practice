package Sortings;
import java.util.*;
public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = {1,0,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        // System.out.println(sort(arr));

    }
    static void sort(int[] arr){
    int i =0;
    // int count =0;
    while(i<arr.length){
    int correct = arr[i];
    if(correct >= 0 && correct < arr.length && arr[i] != arr[correct])
    swap(arr,i,correct);
    else
    i++;
    }
    // to return hthe count , if it is set in correct position or not
    // for(int j = 0 ; j < arr.length ; j++){
    // if(j == arr[j]) count++;
    // }
    // return count;
    }
    static void swap(int[] arr , int i , int correct){
    int temp = arr[i];
    arr[i] = arr[correct];
    arr[correct] = temp;
    }
}
