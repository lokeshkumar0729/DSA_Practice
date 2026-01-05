package Sortings;

public class First_Missing_Positive {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        int i =0;
        while(i<arr.length){
        int correct = arr[i]-1;
        if(arr[i] > 0 && correct <arr.length && arr[i] != arr[correct])
        Swap(arr,i,correct);
        else
        i++;
    }
    Search(arr);
    }
    static void Swap(int[] arr, int i, int correct){
    int temp = arr[i];
    arr[i] = arr[correct];
    arr[correct] = temp;
    
    }
    static void Search(int[] arr){
        for(int i =0;i<arr.length;i++){
    if(arr[i]!= i+1)
    System.out.println(i+1);
        }
        System.out.println(arr.length+1);
    }
}
