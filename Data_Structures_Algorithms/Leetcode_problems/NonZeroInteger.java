

import java.util.Arrays;

public class NonZeroInteger {
    public static void main(String[] args) {
        int[] arr = nonZero(1010);
        System.out.println(Arrays.toString(arr));  // Example: [2, 9]
    }

    static int[] nonZero(int num) {
        for (int a = 1; a < num; a++) {
            int b = num - a;
            if (isNoZero(a) && isNoZero(b)) {
                return new int[]{a, b};
            }
        }
        return new int[]{}; // should never happen, as per problem guarantee
    }

    static boolean isNoZero(int x) {
        while (x > 0) {
            if (x % 10 == 0) {
                return false;
            }
            x /= 10;
        }
        return true;
    }
}
