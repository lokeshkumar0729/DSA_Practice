package Practice_binarySearch_leetcode;
import java.util.*;
public class Starting_ending_Target {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the Array:");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter The Elements into the Array in the Sorted orderd");
        for(int i=0;i<arr.length;i++){
        arr[i] = in.nextInt();
        }
        System.out.print("Enter the target Element:");
        int target = in.nextInt();
       int[] arr1 = Start_End_Element(arr,target);
       System.out.println(Arrays.toString(arr1));
        in.close();
    }
static int[] Start_End_Element(int[] arr, int target){
    if(arr.length == 0)
        return new int[]{-1, -1};

    int startIndex = findIndex(arr, target, true);
    int endIndex = findIndex(arr, target, false);

    return new int[]{startIndex, endIndex};
}

static int findIndex(int[] arr, int target, boolean findStart) {
    int index = -1;
    int start = 0, end = arr.length - 1;

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

}
