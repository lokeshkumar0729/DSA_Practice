

import java.util.*;

public class Coins {
    public static void main(String[] args) {
        int[] arr = {2};
        int target = 3;
        int[] memo = new int[target + 1];
        Arrays.fill(memo, 0);

        int result = chances(arr, target, memo);
        System.out.println(result == Integer.MAX_VALUE ? -1 : result); 
        // -1 means "no solution"
    }

    static int chances(int[] arr, int target, int[] memo) {
        if (target == 0)
            return 0;
        if (target < 0)
            return Integer.MAX_VALUE;
        if (memo[target] != 0) {
            return memo[target];
        }

        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            int res = chances(arr, target - num, memo);
            if (res != Integer.MAX_VALUE) { // only valid results
                min = Math.min(min, 1 + res);
            }
        }

        memo[target] = min;
        return min;
    }
}


/* here is the clear explaination of the recursion 
 *    when the target is 2 , here has two recursive calls 
 *        2
 *       /  \
 *      0    -1 
 *  when target == 0 retun 0  to the  result , it will check the max value , and result , from both it will send min num 
 *   for (int num : arr) {
 *   int res = chances(arr, target - num, memo);                      here , we have completed only one num , we have left anothe num   
            if (res != Integer.MAX_VALUE) { // only valid results       after that condition we have condition to hlod min value , so it hlods  
                                                                        min value 1
            min = Math.min(min, 1 + res);                               later it call the second num , it will max value beacuse it target is < 0
                                                                        so , we alread have min 1 from the previous condition , so , it willl check the condition and it will return min value 1
 * 
 * 
 * 
 */
