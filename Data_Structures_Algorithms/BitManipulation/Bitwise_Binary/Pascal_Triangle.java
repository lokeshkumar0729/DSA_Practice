package Bitwise_Binary;

public class Pascal_Triangle {
    public static void main(String[] args) {
        int n = 5;
        int sum = 1 << n;
        System.out.println("The nth row of pascal tring is "+ sum);
    }
}


/// what is actually a pascal triangle 
//                     1         row 0
//                    1 1
//                  1  2  1
//                 1  3  3  1
//               1  4  6  4  1
//             1  5  10  10  5  1
// 
//   how can we got that
//      
//  num = num * (i-j)/ (j+1)   where it follows ncr
// 
// 