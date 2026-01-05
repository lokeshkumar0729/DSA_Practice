package Bitwise_Binary;

public class Find_ith_Element {
    public static void main(String[] args) {
        int n = 110;
        System.out.println(Integer.toBinaryString(n));
        int m = 4;
       if(Find_Element(n,m)!= 0)
       System.out.println(m+" is set");
       else
       System.out.println("Not set");
    }
    static int Find_Element(int n,int m){
    return (n & (1 << (m-1)));
    
    }
}
