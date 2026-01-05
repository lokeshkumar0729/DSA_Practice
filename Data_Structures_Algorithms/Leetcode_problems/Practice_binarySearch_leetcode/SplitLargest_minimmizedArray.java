package Practice_binarySearch_leetcode;

public class SplitLargest_minimmizedArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8};
        int target = 2;
        System.out.println(splitArray(arr,target));
    }
    static int splitArray(int[] arr, int target){
    int start = 0;
    int end = 0;
    for (int i = 0; i < arr.length;i++){
       start = Math.max(start,arr[i]);
       end += arr[i];
    }
while (start < end) {
    int mid = start + (end-start) /2;
    int sum=0;
    int pieces =1;
    for(int num : arr){
    if(sum+num > mid){
      sum = num;
      pieces++;
    }
    else {
    sum+= num;
    }
    }
    if(pieces > target)
    start = mid +1; // if the picese are more than , the mid is too small , so that we have to increase the mid , so we can put start = mid +1
    else 
    end = mid; // when the picese are not equal to target picese then , mid is big , so that we give end = mid , ans may lies in the end so that we give mid = end
     
}
    

return start;
    }
}
