
import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        List<List<Integer>> ans = permutations(new ArrayList<>(), new int[]{1,2,3}, 0);
        System.out.println(ans);
    }
    static List<List<Integer>> permutations(List<Integer> prefix, int[] arr1, int index){
    if(index == arr1.length){
    List<List<Integer>> list = new ArrayList<>();
    list.add(new ArrayList<>(prefix));
    return list;
    }
    List<List<Integer>> outer = new ArrayList<>();
    int num = arr1[index];
    int n = prefix.size();
    for(int i = 0;i<=n;i++){
     List<Integer> cuurprev = new ArrayList<>(prefix);
     cuurprev.add(i,num);
     outer.addAll(permutations(cuurprev, arr1, index+1));
    }
    return outer;
    }
}
