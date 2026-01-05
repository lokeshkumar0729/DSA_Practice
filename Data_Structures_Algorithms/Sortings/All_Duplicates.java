package Sortings;

import java.util.ArrayList;
import java.util.List;

public class All_Duplicates {
   public static void main(String[] args) {
    
    int[] arr = {1,2,2,3};
         sort(arr);
     System.out.println(findAll(arr));
    }
    static  void sort(int[] arr){
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
  static   void swap(int[] arr, int i , int correct){
    int temp = arr[i];
    arr[i] = arr[correct];
    arr[correct] = temp;
    }
  static   List<Integer> findAll(int[] arr){
    List<Integer> list = new ArrayList<>();
    int i = 0;
    for(i =0;i<arr.length;i++){
    if(arr[i] != (i+1)){
    list.add(arr[i]);
    }
    }
    return list;
}

}
