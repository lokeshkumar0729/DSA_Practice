import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        check(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
     static void check(int[] nums1 , int m , int[] nums2 , int n){
    int i = 0, j= 0,size;
    while(i<m + j&& j < n){
    if(nums1[i] <= nums2[j]){
    i++;
    }
    else {
    size = m + j- 1;
    for(int k = size ; k >= i;k--){
        nums1[k+1] = nums1[k];
    }
    nums1[i] = nums2[j];
    i++;
    j++;
    }
   
    while( j < n){
    nums1[i] = nums2[j];
    i++;
    j++;
    }
    }
    }
}
