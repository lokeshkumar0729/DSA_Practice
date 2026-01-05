package Stack_queues.Stacks;

import java.util.Stack;

public class LargestRectangleArea {
    public static void main(String[] args) {
        System.out.println(AreaRectangle(new int[]{2,1,5,6,2,3}));
    }
    public static int AreaRectangle(int[] nums){
    int max = 0;
    Stack<Integer> stack = new Stack<>();
    for(int i = 1;i< nums.length;i++){
        if(stack.isEmpty()){
        stack.push(0);
        }
        if(nums[i] > stack.peek())
        stack.push(i);
        else {
        int poped  = stack.pop();
       
        int ans = (poped + 1 ) - (poped - 1) -1;
        int width =  nums[poped] * ans;
        max = Math.max(max,width);
        }
    }
    while(!stack.isEmpty()){
     int poped  = stack.pop();
       
        int ans = (poped + 1 ) - (poped - 1) -1;
        int width =  nums[poped] * ans;
        max = Math.max(max,width);
    }
    return max;
    }
}
