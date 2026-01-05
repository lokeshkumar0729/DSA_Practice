package Practice_binarySearch_leetcode;

public class CountRotations_in_RotatedArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6};
        int result = findpivot(arr);
        // if(result != arr.length-1){
        // System.out.println(result+1);
        // }
        // else {
        System.out.println(result+1);
        // }
    }
     static int findpivot(int[] arr){
    int start =0;
    int end = arr.length-1;
    while (start <= end ) {
        int mid = start + (end-start)/2;
        // 4 cases 
        if (arr[mid] > arr[mid+1] && start < end) {
            return mid;
        }
        if (arr[mid] < arr[mid-1] && mid > start) {
            return mid-1;
        }
        if (arr[mid] <= arr[start]) {
            end = mid-1;
        }
        else {
        start = mid+1;
        }
    }
    return -1;
    }
}
