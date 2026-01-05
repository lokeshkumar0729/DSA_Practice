package Recursion;

public class Palindrome {
    public static void main(String[] args) {
      System.out.println(palindrome_3(1234321));  
    }
    static String palindrome(int n){
    int ans = helper(n,0);
    if(n == ans)
    return "Palindrome";
    else 
    return "Not Palindrome";
    }
    static int helper(int n , int rev){
    if(n == 0)
    return rev;
    return helper(n/10, rev*10 + n %10);
    }
    // method two
    static String palindrome_2(int n){
    char[] arr = String.valueOf(n).toCharArray();
    int i =0 , j = arr.length -1;
    while(i < j){
    if(arr[i] != arr[j]){
    return "Not palindrome";
    }
    i++;
    j--;
    }
    return "Palindrome";
    }
    // method 3 
    // using Stringbuliders
    static String palindrome_3(int n){
    String arr = String.valueOf(n);
    String reverse = new StringBuilder(arr).reverse().toString();
    if(arr.equals(reverse))
    return "palindrome";
    return "Not palindrome";
    
    }
}
