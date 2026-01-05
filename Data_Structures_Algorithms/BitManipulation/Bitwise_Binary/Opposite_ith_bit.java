package Bitwise_Binary;

public class Opposite_ith_bit {
       public static void main(String[] args) {
        int n = 607;
        int m = 4;
        System.out.println(n);
        System.out.println(Integer.toBinaryString(n));
        int ans = Find_Element(n,m);
        System.out.println(ans);
        System.out.println(Integer.toBinaryString(ans));
    }
    static int Find_Element(int n,int m){
    return (n & ~(1 << (m-1)));
    
    }
}

// if 1 it should become 0, if 0 it sholud 0 
