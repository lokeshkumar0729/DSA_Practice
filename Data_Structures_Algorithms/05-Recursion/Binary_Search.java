package Recursion;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1,5,9,11,90,120};
        int target = 97;
        int start = 0;
        int end = arr.length -1;
       System.out.println("Index is : "+binarySearch(arr,target,start,end));
    }
    static int binarySearch(int[] arr,int target, int start,int end){
        if(start > end)
        return -1;
    int mid = start + (end- start)/2;
    if(arr[mid] == target)
    return mid;
    else if(arr[mid] > target){
    return binarySearch(arr, target, start, mid-1);}
    else {
    return binarySearch(arr, target, mid+1, end);
    }
   
    }
    
    }

