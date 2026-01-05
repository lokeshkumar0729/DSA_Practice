package Recursion;


public class ReduceNo_ToMakeZero {
    public static void main(String[] args) {
        int ans = ReduceNum(41);
        if(ans >0)
        System.out.println(ans -1);
        else 
        System.out.println(ans);
    }
    static int ReduceNum(int n){
        int count = 0;
    if(n == 0)
    return 0 ;
    
    if(n%2 != 0){
    n = n-1;
    count++;
}
 if(n%2 == 0){
count++;
}

    return count + ReduceNum(n/2);
    }
}
