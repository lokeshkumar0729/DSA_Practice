package Stack_queues.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class InBuilt {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(11);
        queue.add(12);
        System.out.println(queue.remove());
    }
}
