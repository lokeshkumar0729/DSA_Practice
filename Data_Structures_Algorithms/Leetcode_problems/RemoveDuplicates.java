
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 1 };
        System.out.println(removeDuplicates(arr));

    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;

    }
}
