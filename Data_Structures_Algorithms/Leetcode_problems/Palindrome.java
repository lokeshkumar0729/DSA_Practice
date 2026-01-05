public class Palindrome {
    public static void main(String[] args) {
System.out.println(palindrome(0));
    }

    static boolean palindrome(int num) {
        int rem ;
        int sum = 0;
        if (num < 0)
            return false;
        int n = num;
        while (n != 0) {
            rem = n % 10;
            sum = (sum * 10)+ rem;
            n /= 10;
        }
        return sum == num;
    }
}
