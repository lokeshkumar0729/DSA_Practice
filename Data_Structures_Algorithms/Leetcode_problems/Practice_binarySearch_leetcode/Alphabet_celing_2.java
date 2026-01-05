package Practice_binarySearch_leetcode;

import java.util.Scanner;

public class Alphabet_celing_2 {
          public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Celing of the giving number");
        System.out.print("Enter the size of the Array:");
        int size = in.nextInt();
        char[] arr = new char[size];
        System.out.println("Enter the elements into the Array:");
        for (int i =0;i<arr.length;i++)
        arr[i] = in.next().charAt(0);
        System.out.print("Enter the element to searched:");
        char target = in.next().charAt(0);
         char index = binarysearch(arr,target);
         if(index != '\0')
         System.out.println("The ceil alphabet for the String "+target+" is "+index);
         else {
        System.out.println("Element is out of bounds");
        }
        in.close();
    }
    static char binarysearch(char[] arr, char target){
    if(arr.length == 0)
    return '\0';


    int start =0;
    int end = arr.length -1;
    while (start <= end ) {
        int mid = start +(end-start)/2;
        if(target < arr[mid])
        end = mid-1;
        else 
        start = mid+1;
    
    }
    return arr[start % arr.length];
}
}
