package Arrays;
import java.util.*;;
public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Size of the Array:");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Elements into the Array:");
        for(int i=0;i<arr.length;i++){
        arr[i] = in.nextInt();
        }
        System.out.print("Enter the number to be searched:");
        int num = in.nextInt();
        System.out.print("Enter the index range to be Searched:");
        int lower_index = in.nextInt();
        int upper_index = in.nextInt();
     int find = Search_in_range(arr,num,lower_index,upper_index);
     if(find > -1){
    System.out.println("The number "+num+" Find at index "+find);}
    if(find == -1){
    System.out.println("The lower index must be lesser than the Upper index");}
    if(find == -2){
    System.out.println("You have to must declare the array");}
    if(find == -3){
    System.out.println("The Element does not exits with in the Range "+lower_index+" to "+upper_index);}
        in.close();
        
    }
   static int Search_in_range(int[] arr,int num , int lower_index , int upper_index){
    if (lower_index > upper_index){
    return -1;}
    if (arr.length == 0){
    return -2;
    }
    for(int i =lower_index; i<=upper_index;i++){
    if (arr[i] == num){
    return i;
    }
    }
    return -3;
    }
}
