package DataStructures;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQueue {
    public static void main(String[] args) {
        /*PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(1);
        pq.add(5);
        pq.add(3);
        pq.add(2);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.size());*/

        //MaxPriority Queue
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        System.out.println(pq.isEmpty());
        pq.add(10);
        pq.add(5);
        pq.add(20);
        System.out.println(pq.peek());
    }
}
