package Bitwise_Binary;


public class FindDuplicate_Oddtimes {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2,7,7,8,7,8,8};
        // int ans =
         Find_Duplicate(arr);
        // System.out.println(ans);
    }
    static void Find_Duplicate(int[] arr){
        int sum =0;
        for(int num : arr){
            // Integer temp = num;
            // System.out.println(temp.getClass().getSimpleName());
         System.out.println(Integer.toBinaryString(num));
         sum += num;
         
        }
        System.out.println(sum);
        System.out.println(Integer.toBinaryString(sum));
        // System.out.println(sum);
        // return sum % 3;
    }
}
