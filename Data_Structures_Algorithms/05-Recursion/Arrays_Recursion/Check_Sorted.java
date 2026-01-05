package Arrays_Recursion;

public class Check_Sorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        boolean ans = checkSorted(arr, 0);
        if(ans)
        System.out.println("The Array is sorted");
        else
        System.out.println("The Array is Unsorted");
    }
    static boolean checkSorted(int[] arr,int index){
    if(index == arr.length -1){
    return true;
    }
    return arr[index] < arr[index + 1] && checkSorted(arr, index+1);

    }
}
