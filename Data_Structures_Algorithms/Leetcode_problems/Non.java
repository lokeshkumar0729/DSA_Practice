

import java.util.Arrays;

public class Non {
    public static void main(String[] args) {
        int[] arr = non(4102);
        System.out.println(Arrays.toString(arr));
    }

    static int[] non(int num) {
        int b = num - 1;
        int result = b;
        while (b > 0) {
            int rem = b % 10;
            if (rem == 0) {
                b = result - 1;
                result = result - 2;
            }
            b = b / 10;
        }
        int a = num - result;
        int c = a;
        while (a > 0) {
            int rem = a % 10;
            if (rem == 0) {
                a = c + 1;
                c = c + 2;
                result--;
            }
            a = a / 10;
        }
        result = Math.abs(c-num);
        return new int[] { c, result };

    }
}
