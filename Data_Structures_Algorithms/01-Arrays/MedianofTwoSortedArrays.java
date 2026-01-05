package Arrays;
public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
       double ans = findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 });
        System.out.println(ans);
    }

    static public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mix = merge(nums1, nums2);
        int length = mix.length;
        double median;
        if(length % 2 == 0){
         median = (mix[length / 2 - 1] + mix[length / 2]) / 2.0;
        }else {
        median = mix[length/ 2];
        }

        return median;
    }

    static public int[] merge(int[] nums1, int[] nums2) {
        int[] mix = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mix[k++] = nums1[i++];
            }
           else {
                mix[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            mix[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            mix[k++] = nums2[j++];
        }
        return mix;
    }
}
