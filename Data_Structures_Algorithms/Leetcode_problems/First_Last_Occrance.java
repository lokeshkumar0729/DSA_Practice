
import java.util.*;
public class First_Last_Occrance {
    public static void main(String[] args) {
          int[] arr ={1,2,5,5,5,5,5,5,6,7,8};
          int[] ans = first_last(arr, 5);
          System.out.println(Arrays.toString(ans));
    }

   static int[] first_last(int[] arr, int target) {
    int first = -1, last = -1;

    // Find first occurrence
    int start = 0, end = arr.length - 1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            first = mid;
            end = mid - 1; // go left to find earlier occurrence
        } else if (arr[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }

    // Find last occurrence
    start = 0;
    end = arr.length - 1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            last = mid;
            start = mid + 1; // go right to find later occurrence
        } else if (arr[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }

    return new int[] {first, last};
}

}
