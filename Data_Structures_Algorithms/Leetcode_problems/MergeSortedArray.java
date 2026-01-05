import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 ={2,5,6};
        merge(num1, 3, num2, 3);
    }

    static void merge(int[] num1, int m, int[] num2, int n) {
        int[] mergeArray = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (num1[i] > num2[j]) {
                mergeArray[k] = num2[j];
                j++;
            }
            else{
                mergeArray[k] = num1[i];
                i++;
            }
            k++;
        }
        while(i < m){
        mergeArray[k] = num1[i];
        i++;
        k++;
        }
        while(j < n){
        mergeArray[k] = num2[j];
        j++;
        k++;
        }
        System.out.println(Arrays.toString(mergeArray));
    }
}
