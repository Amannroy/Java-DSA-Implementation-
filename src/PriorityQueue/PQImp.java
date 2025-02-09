package PriorityQueue;

import java.util.PriorityQueue;

public class PQImp {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(5);
        pq.offer(2);
        pq.offer(3);
        int min = pq.poll();
        System.out.println(min);
    }
}
