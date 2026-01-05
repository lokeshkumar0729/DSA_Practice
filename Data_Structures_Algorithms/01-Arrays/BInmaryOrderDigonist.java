package Arrays;
import java.util.*;
public class BInmaryOrderDigonist {
    
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
    static void BinarySearch(int[] arr,int num){
    if(arr.length == 0){
    return;
    }
    String name;
    int start = 0;
    int end = arr.length-1;
     if (arr[start] > arr[end]){
         name = "Decending";

    }
    else {
         name = "Ascending";
    }
    while(start <= end){
           int mid = start+(end-start)/2;
    if(name.equals("Ascending"))   {     
    if(arr[mid] == num){
    System.out.println("The Element "+num+" found at index "+mid);
    return;
    }
    else if (num > arr[mid]){
        start = mid+1;
    }
    else {
    end = mid-1;
    }
}
else {
     if(arr[mid] == num){
    System.out.println("The Element "+num+" found at index "+mid);
    return;
    }
    else if (num > arr[mid]){
        end = mid-1;
    }
    else {
    start = mid+1;
    }

}
}
    
    System.out.println("Element does not found");
 
    
    
    }
}
