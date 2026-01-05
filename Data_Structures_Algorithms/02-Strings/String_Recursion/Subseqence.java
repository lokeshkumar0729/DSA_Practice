package String_Recursion;
import java.util.*;
public class Subseqence {
    public static void main(String[] args) {
        subsequence("","abc");
        System.out.println(subseqret("", "abc"));
        
    }
    static void subsequence(String  p ,String up){
    if(up.isEmpty()){
    System.out.println(p);
    return ;
    }
    char ch = up.charAt(0);
    subsequence(p + ch , up.substring(1));
    subsequence(p,up.substring(1));
    
    
    }
    static ArrayList<String> subseqret(String  p ,String up){
    if(up.isEmpty()){
    ArrayList<String> list = new ArrayList<>();
    list.add(p);
    return list;
    }
    char ch = up.charAt(0);
   ArrayList<String> left =  subseqret(p + ch , up.substring(1));
   ArrayList<String> right = subseqret(p,up.substring(1));
    left.addAll(right);
    return left;
    
    }
}
