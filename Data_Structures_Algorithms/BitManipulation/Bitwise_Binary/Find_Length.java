package Bitwise_Binary;

public class Find_Length {
    public static void main(String[] args) {
        int n = 4343;
        int base = 10;
        // we can do it n > 0 and >> right shift by 1 
        // else we can do it like this
        // if base is 2 , length in binary 
        // if base is 10 then, length is in decimal format like normal

        // if log2(8) = 2 pow 1 != 8
        //              2 POw 2 != 8
        //              2 POw 3 == 8 so it will 3
        
        // if log2(10)   2 pow 1 != 10
        //              2 POw 2 != 10
        //              2 POw 3 != 10
        //               pow 4 is beyond the 10 
        // so it will lies inbetween so , it 3.32  
        int ans= (int)(Math.log(n) / Math.log(base))+1;
        System.out.println(ans);
    }
}
