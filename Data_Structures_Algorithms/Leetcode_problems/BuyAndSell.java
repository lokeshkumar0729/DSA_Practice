

public class BuyAndSell {
    public static void main(String[] args) {
        System.out.println(sell(null));
    }
    static int sell(int[] arr){
    if(arr.length == 0)
    return 0;
    int min = arr[0];
    int max = 0;
    for(int i = 1; i < arr.length;i++){
    if(min > arr[i])
    min = arr[i];
    else {
    max = Math.max(max,arr[i]-min);
    }
    }
    return max;
    
    }
}
