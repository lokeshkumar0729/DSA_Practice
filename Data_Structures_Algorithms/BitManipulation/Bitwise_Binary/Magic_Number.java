package Bitwise_Binary;

public class Magic_Number {
    public static void main(String[] args) {
        int n = 6;
        int ans = 0;
        int base = 5;
        while(n > 0){
        int last = n & 1;
        n = n >> 1;
        ans += last * base;
        base = base *5;
        }
        System.out.println(ans);
    }
}
// basically the concept is like 
// 0 = 0000
// 1 = 0001
// 2 = 0010
// 3 = 0011
// 4 = 0100
// 5 = 0101
// 6 = 0110 => 5pow 1 + 5 pow 2 + 5 pow 3 = 150
