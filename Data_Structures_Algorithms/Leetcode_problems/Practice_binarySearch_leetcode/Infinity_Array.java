package Practice_binarySearch_leetcode;



public class Infinity_Array {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        int index = search(arr,target);
       System.out.println(search(arr, target));
}

static int search(int[] arr, int target){
int start =0;
int end =1;
while (target >arr[end]){
int newstart = end+1;
end = end + (end -start +1) * 2;
start = newstart;
}
return binarysearch(arr, target, start, end);
}
static int binarysearch(int[] arr, int target,int start, int end){


    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (target < arr[mid]) {
            end = mid - 1;
        } else if (target > arr[mid]) {
            start = mid + 1;
        } else {
           
            return mid;
           
        }
    }

    return -1;
}
}