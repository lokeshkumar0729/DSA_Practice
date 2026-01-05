

public class CombinationsSum {
       public static void main(String[] args) {
        long[] arr = {1,2,3,4};
        long target = 10;
        System.out.println(chances(arr, target, ""));
     }
     static long chances(long[] arr , long target , String p){
      long count = 0;
      long count2 =0;
    if(target == 0){
    
    return 1;
    }
    if(target < 0)
    return 0;
    for(long num : arr){
     count = count + chances(arr, target-num, p+num);
     count2 = count2 + chances(arr, target, p+num);
    }
    return count + count2;
    }
}
