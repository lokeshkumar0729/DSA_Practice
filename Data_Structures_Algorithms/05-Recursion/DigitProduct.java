package Recursion;

public class DigitProduct {
    
    public static void main(String[] args) {
        System.out.println(digitpro(55));
    }
    static int digitpro(int n){
    if(n == 0)
    return 1;
   return (n%10) * digitpro(n/10);
    }
}
