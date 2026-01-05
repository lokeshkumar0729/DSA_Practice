package Practice_binarySearch_leetcode;

public class Serach_inas_dec {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int num = peakelement(arr);
        int num2 = findnum(arr, target,num);
        System.out.println(num2);
    }


    static int findnum(int[] arr, int target,int num){

        if (arr.length == 0)
        return -1;

        int start = binarysearch(arr ,target,0, num,true);
        int end;
        if(start < 0){
       end = binarysearch(arr , target ,num+1,arr.length-1,false);
       return end;
        }
        else 
        return start;
    }
 static int binarysearch(int[] arr,int target,int start,int end,boolean findStart){
     int index = -1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (target < arr[mid]) {
            end = mid - 1;
        } else if (target > arr[mid]) {
            start = mid + 1;
        } else {
            index = mid;
            if (findStart) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }

    return index;
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
//[1,2,3,4,5,3,1], target = 3