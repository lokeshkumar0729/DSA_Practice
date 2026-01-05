package Stack_queues.Queues;

public class QueueMain {
public static void main(String[] args) throws Exception {
    // CustomQueue queue = new CustomQueue(5);
    // queue.insert(1);
    // queue.insert(2);
    // queue.insert(3);
    // queue.insert(4);
    // queue.Display();
    // System.out.println(queue.remove());
    // queue.Display();

    CircularQueue queue1 = new CircularQueue(5);
    queue1.insert(1);
    queue1.insert(2);
    queue1.insert(3);
    queue1.insert(4);
    queue1.insert(5);
    queue1.display();
    System.out.println(queue1.remove());
    System.out.println(queue1.remove());
    System.out.println(queue1.remove());
       queue1.insert(6);
    queue1.insert(7);

    queue1.display();
}
}
