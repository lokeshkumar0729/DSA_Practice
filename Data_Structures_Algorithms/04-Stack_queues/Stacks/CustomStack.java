package Stack_queues.Stacks;



public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public CustomStack() {
        // this.data = new int[DEFAULT_SIZE];
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return false;
        }
        data[++ptr] = item;
        return true;
    }

    public int pop() throws CustomException {
        if (isEmpty()) {
            throw new CustomException("Cannot be pop from the stack");
        }
        return data[ptr--];
    }

    public int peek() throws CustomException {
        if (isEmpty()) {
            throw new CustomException("Cannot be peek from the stack");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
