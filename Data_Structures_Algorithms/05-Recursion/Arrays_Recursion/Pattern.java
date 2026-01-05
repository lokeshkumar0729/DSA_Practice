package Arrays_Recursion;

public class Pattern {
 public static void main(String[] args) {
  pattern_recur(4, 1);
 } 
 static void pattern_recur(int n , int m){
    if(m > n){
    return ;
    }
  for(int i = m; i<= n;i++){
  System.out.print("* ");
} 
System.out.println();
pattern_recur(4, m+1); 
}
}
