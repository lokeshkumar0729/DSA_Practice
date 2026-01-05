package Bitwise_Binary;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,6,4,2};
        int[] arr_1 = {-2,3,-3,4,6,-4,2};
        System.out.println(ans(arr));
        System.out.println(ans_2(arr_1));
    }
    static int ans(int[] arr){
    
    int unique =0;
    for(int n : arr){
     unique ^= n;    
    }
    return unique;
    }

    // if the array has negative elements
static int ans_2(int[] arr){
  int unique =0;
    for(int n : arr){
     unique += n;    
    }
    return unique;

}
}


// unique = 0 ^ 2 = 2

// unique = 2 ^ 3 = 1 (binary: 10 ^ 11 = 01)

// unique = 1 ^ 3 = 2 (binary: 01 ^ 11 = 10) → 3 cancels

// unique = 2 ^ 4 = 6 (binary: 10 ^ 100 = 110)

// unique = 6 ^ 6 = 0 → 6 cancels

// unique = 0 ^ 4 = 4

// unique = 4 ^ 2 = 6