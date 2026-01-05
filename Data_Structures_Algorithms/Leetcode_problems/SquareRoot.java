
public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(square(9));
    }
    static int square(int target){
    int low = 1 , high = target , ans = -1;
    while(low <= high){
        int mid = (low+high)/2;
    if(mid*mid <= target){
    ans = mid ;
    low = mid +1;
    
    }
    else{
    high = mid -1;
    }
    }
    return ans;
    }
}
