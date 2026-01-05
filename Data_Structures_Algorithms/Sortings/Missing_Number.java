package Sortings;

public class Missing_Number {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3};  // Try also with {0, 1, 3}
        sort(arr);
        int result = search(arr);
       System.out.println(result);
    }

    static int search(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != i)
                return i;
        }
        return arr.length;
    }

    static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
