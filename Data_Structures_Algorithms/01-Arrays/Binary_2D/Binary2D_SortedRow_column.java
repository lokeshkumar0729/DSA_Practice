package Binary_2D;

import java.util.Arrays;

public class Binary2D_SortedRow_column {
     public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4,5},       // this code is only is use full for when we contain only equal number of rows and columuns
                       {15 ,26, 27, 38,40},
                       {19,30,42,45,55},
                       {23,34,43,46,60}};
        int target = 55;               
         int[] arr_1 = binary_search_2d_Array(arr,target);   
         System.out.println(Arrays.toString(arr_1));      
    }
    static int[] binary_search_2d_Array(int[][] arr,int target){
    
    int r = 0;
    int c = arr.length-1;
    while (r<arr.length && c >= 0) {
        if(arr[r][c] == target)
        return new int[]{r,c};

        if(arr[r][c] > target){
            c--;
        }
        else
        r++;

} 
return  new int[]{-1,-1};   }
}
