package Practice_binarySearch_leetcode;

public class Peakelement {
     public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(peakelement(arr));
}
static int peakelement(int[] arr){ 
    int start =0, end =arr.length-1;
    while(start < end){
        int mid=start +(end-start)/2;
        if(arr[mid] > arr[mid+1])
          end = mid;
        else {
       start = mid +1;
        }
    }
    return end;
    }
}