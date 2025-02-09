package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();  // It creates a queue that stores integers using a LinkedList

        queue.add(10);
        queue.add(20);

        System.out.println(queue.peek());

        queue.remove();

        System.out.println(queue.peek());

    }
}
