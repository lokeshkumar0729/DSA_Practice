package Arrays;
import java.util.*;
public class SearchIn_2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of Rows:");
        int n = in.nextInt();
        System.out.print("Enter the number of columns:");
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the Elements into the Array");
        for (int i = 0 ; i< n; i++){
        for(int j = 0 ; j < m ; j++){
         arr[i][j] = in.nextInt();
        }}
        System.out.println("The elements present in the Array is :");
        for (int i =0;i < arr.length;i++)
        System.out.println(Arrays.toString(arr[i]));
        System.out.print("Enter the Element to be searched:");
        int num = in.nextInt();
        Search(arr,num);
       
        in.close();;
    }
    static void Search(int[][] arr,int num){
         boolean found = false;
    if(arr.length ==0 )
    System.out.println("Array is not declared");
    for(int i =0 ; i<arr.length;i++){
    for (int j =0 ; j<arr[i].length;j++){
    if (arr[i][j] == num){
    System.out.println("The element "+num+" found at index ["+i+"]["+j+"]");
    found = true;
    break;
    }
}}
if(!found)
System.out.println("Element does not found in the array");
    }
}
// actually wecan reteun in the array from like
// int[] newarr = search()
// static int[] search(int[][] arr, int num)
//retrun new int[]{row,col} this  is the declareation for the array 






// to declare max_value or min_value 
// we have to   use wrapper class
// int a = Integer.MIN_VALUE;