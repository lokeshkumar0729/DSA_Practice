package Recursion;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count_zeros(30210004));
    }
    static int count_zeros(int n){
    if(n == 0)
    return 0;
    int count =0;
    int rem = n % 10;
    if(rem == 0)
    count++;
    return count + count_zeros(n/10);
    }
}
