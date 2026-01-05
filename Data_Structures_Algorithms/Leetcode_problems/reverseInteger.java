
public class reverseInteger {
    public static void main(String[] args) {
        int x = 1534236469;
        int reversed = reverse(x);
        System.out.println("Reversed: " + reversed);
    }
    static int reverse(int num) {
        if(num > (Math.pow(2, 31)-1))
        return 0;
        int rev  = 0;
        while(num!=0){
        int rem = num % 10;
           if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7))
            return 0;
        if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8))
            return 0;
        rev = (rev * 10) + rem;
        num/=10; 
        }
        return rev;
    }
}

