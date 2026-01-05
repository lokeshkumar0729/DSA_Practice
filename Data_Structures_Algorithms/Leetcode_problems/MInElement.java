

public class MInElement {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 6, 11 ,4};
        System.out.println(minelement(arr, arr[0],arr.length-1));
    }

    static int minelement(int[] arr, int min, int r) {
        if (r < 0) {
            return min;
        }
       
            if (arr[r] < min) {
                min = arr[r];
            }
            return minelement(arr, min, r - 1);
        
    }
}
