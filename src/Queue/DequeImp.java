package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeImp {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.removeFirst();
        deque.removeLast();

        System.out.println(deque);
    }
}
