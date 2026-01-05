
import java.util.Arrays;

public class Memo {
    
     public static void main(String[] args) {
        int[] arr = {1,2,3,4};
         int target = 10;
         int[] memo = new int[target+1];
         Arrays.fill(memo, 0);
        System.out.println(chances(arr, target, "",memo));
     }
     static int chances(int[] arr , int target , String p,int[] memo){
        
      int count = 0;
    if(target == 0){
    
    return 1;
    }
    if(target < 0)
    return 0;
    if(memo[target] != 0){
    return memo[target];  
    }
    for(int num : arr){
     count = count + chances(arr, target-num, p+num,memo);
    }
    memo[target] = count;
    return count;
    }

}
