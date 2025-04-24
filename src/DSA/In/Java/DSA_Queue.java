package DSA.In.Java;

import java.util.LinkedList;
import java.util.Queue;

public class DSA_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        // 1 2 2
    }
}
