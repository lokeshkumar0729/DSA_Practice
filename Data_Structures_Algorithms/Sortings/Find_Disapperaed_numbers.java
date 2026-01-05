package Sortings;
import java.util.*;
public class Find_Disapperaed_numbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        sort(arr);
        
    System.out.println(findAll(arr));
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
    static List<Integer> findAll(int[] arr){
    List<Integer> list = new ArrayList<>();
    int i = 0;
    for(i =0;i<arr.length;i++){
    if(arr[i] != (i+1)){
    list.add(i+1);
    }
    }
    return list;
}
}