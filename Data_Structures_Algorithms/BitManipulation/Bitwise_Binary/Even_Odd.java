package Bitwise_Binary;

public class Even_Odd {
    public static void main(String[] args) {
        int  n = 68;
       System.out.println(isOdd(n));
    }
    static String isOdd(int n){
       if((n&1)==1)
       return "Odd";
       else 
       return "Even";
    
    }
}
