import java.util.*;
public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        System.out.println(maxsub(arr));
    }

   static int maxsub(int[] arr){
    int max =Integer.MIN_VALUE;
    List<List<Integer>> outer = new ArrayList<>();
    outer.add(new ArrayList<>());
    for(int num : arr){
    int n = outer.size();
    for(int i =0;i<n;i++){
    List<Integer> inner = new ArrayList<>(outer.get(i));
    inner.add(num);
  int sum = 0;
  for(int num1 : inner){
    sum+= num1;
}
if(sum > max)
 max = sum;

    outer.add(inner);
    
    }
    }
 
    return max;

}
}
