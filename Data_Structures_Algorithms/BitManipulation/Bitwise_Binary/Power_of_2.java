package Bitwise_Binary;

public class Power_of_2 {
    public static void main(String[] args) {
        int n = 134;
        boolean ans = (n & (n-1)) == 0;
         System.out.println(ans);
    }
}
