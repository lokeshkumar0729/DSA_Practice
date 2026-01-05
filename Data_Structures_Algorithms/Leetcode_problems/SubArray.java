public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
          System.out.println(print(arr));;
    }

    static int print(int[] arr) {
        int sum=0 ,max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
           
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if(sum > max)
                max = sum;
                sum = 0;
            }
        }
        return max;
    }
}
