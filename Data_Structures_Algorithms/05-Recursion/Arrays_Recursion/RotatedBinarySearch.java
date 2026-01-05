package Arrays_Recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 1, 2, 3, 4 };
        int target = 4;
        int start = 0;
        int end = arr.length - 1;
        int ans = rotatedBinarySearch(arr, target, start, end);
        System.out.println(ans);
    }

    static int rotatedBinarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return rotatedBinarySearch(arr, target, start, mid - 1);
            } else {
                return rotatedBinarySearch(arr, target, mid + 1, end);
            }

        }
        if (target >= arr[mid] && target <= arr[end])
            return rotatedBinarySearch(arr, target, mid + 1, end);
        return rotatedBinarySearch(arr, target, start, mid - 1);

    }
}
