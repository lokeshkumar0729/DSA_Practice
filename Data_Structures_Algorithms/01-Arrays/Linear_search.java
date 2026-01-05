package Arrays;
import java.util.*;
public class Linear_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements into the Array");
        for(int i =0; i<arr.length;i++)
        arr[i] = in.nextInt();
        System.out.print("Enter the Element to be searched.......:");
        int num = in.nextInt();
         int index = Linear(num,arr);
         if(index != -1){
        System.out.println("The Element "+num+" found at index "+index);
        }
        else {
        System.out.println("The Element "+num+" NOt present in the array");
        }
        in.close();
    }
    static int Linear(int num,int[] arr){
    for(int i =0 ;i < arr.length;i++){
    if (num == arr[i]){
        return i;
    }
}
    return -1;
    
    }
}
