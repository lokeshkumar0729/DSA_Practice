public class JumpGame {
   public static void main(String[] args) {
    System.out.println(jump(new int[]{2,3,1,1,4}));
   }
    public static boolean jump(int[] arr){
    if(arr.length == 0){
        return false;
    }
    int i = 0;
   while(i < arr.length){
    if(i == arr.length -1){
    return true;
    }
    i = i+arr[i];
}
return false;
    }
}
