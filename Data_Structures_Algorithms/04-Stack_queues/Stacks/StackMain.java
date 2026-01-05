package Stack_queues.Stacks;

public class StackMain {
    public static void main(String[] args) throws CustomException  {
        // CustomStack stack = new CustomStack(5);
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // stack.push(4);
        // stack.push(5);
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        DynamicStack stack2 = new DynamicStack(5);
        stack2.push(1);
        stack2.push(12);
        stack2.push(11);
        stack2.push(13);
        stack2.push(14);
        stack2.push(15);
        stack2.push(16);
        stack2.push(17);
        stack2.push(18);
        stack2.push(19);
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());

    
    }
}
