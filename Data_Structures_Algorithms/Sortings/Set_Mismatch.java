package Sortings;
import java.util.*;
public class Set_Mismatch {
    public static void main(String[] args) {
        int[] arr = {2,2};
           sort(arr);
           int[] result = findAll(arr);
System.out.println(Arrays.toString(result));
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
   static  int[] findAll(int[] arr){
   
    int i = 0;
    for(i =0;i<arr.length;i++){
    if(arr[i] != (i+1)){
    //     if(arr[i] > i+1)
    // return new int[]{i+1,arr[i]};
    // else 
    return new int[]{arr[i],i+1};
   
    }
    }
    return new int[]{-1,-1};

    }
}
