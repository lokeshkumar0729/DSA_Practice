package Arrays;
import java.util.*;
public class Binary_Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Binary Search Program");
        System.out.print("Enter the size of the Array:");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter The Elements into the Array in the Sorted orderd");
        for(int i=0;i<arr.length;i++){
        arr[i] = in.nextInt();
        }
        System.out.print("Enter the Element to search:");
        int num = in.nextInt();
        BinarySearch(arr,num);
        in.close();

        
    }
    static int BinarySearch(int[] arr,int num){
    if(arr.length == 0){
    return -1;
    }
    int start = 0;
    int end = arr.length-1;
 
    while(start <= end){
           int mid = start+(end-start)/2;
    if(arr[mid] == num){
    
    return mid;
    }
    else if (num > arr[mid]){
        start = mid+1;
    }
    else if(num < arr[mid]){
    end = mid-1;
    }
}
    
    return -1;
 
    
    
    }
}
