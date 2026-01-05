package Stack_queues.Queues;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int front = -1;
    protected int end = -1;
    protected int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        }

        if (isEmpty()) {
            front = 0;
        }

        end = (end + 1) % data.length;
        data[end] = item;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        int removed = data[front];
        front = (front + 1) % data.length;
        size--;

        if (size == 0) {  // reset when queue becomes empty
            front = -1;
            end = -1;
        }

        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i = (i + 1) % data.length;
        } while (i != (end + 1) % data.length);

        System.out.println("END");
    }
}
