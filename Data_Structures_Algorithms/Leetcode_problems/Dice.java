public class Dice {
     public static void main(String[] args) {
        int[] arr = {1,3};
        int target = 2;
        chances(arr, target, "");
     }
     static void chances(int[] arr , int target , String p){
    if(target == 0){
    System.out.println(p);
    return ;
    }
    if(target < 0)
    return;
    for(int num : arr){
    chances(arr, target-num, p+num);
    }
    }
}
