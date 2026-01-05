
import java.util.*;
public class PlusOne {
    public static void main(String[] args) {
System.out.println(Arrays.toString(array(new int[]{1,9,9})));
    }

    static int[] array(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
         int len = arr.length ;
        int i = arr.length - 1;
        for (int num = i; num >= 0; num--) {
            if (arr[num] <= 8) {
                arr[num] = arr[num] + 1;
                return arr;
            } else {
                arr[num] = 0;
            }

        }
       int[] copy = new int[len + 1];
       copy[0] = 1;
       return copy;

    }
}
