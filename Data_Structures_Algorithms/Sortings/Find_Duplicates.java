package Sortings;
import java.util.*;
public class Find_Duplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Search(arr));
  

    }
    static int Search(int[] arr){
    for(int i =0;i<arr.length;i++){
    if(arr[i] != i+1)
    return arr[i];

    }
    return -1;
    
    }
    static void sort(int[] arr){
    int i =0;
    while(i < arr.length){
    int correct = arr[i]-1;
    if(arr[i] != arr[correct]){
    swap(arr,i,correct);
 }
    else 
    i++;
    }
    
}
    static void swap(int[] arr, int i , int correct){
    int temp = arr[i];
    arr[i] = arr[correct];
    arr[correct] = temp;
    }

}