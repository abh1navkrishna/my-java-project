package test;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            queue.offer(i);
        }

        int count = 0;

        for (Integer num : queue) {
            if (count == 5)
                break;
            System.out.println(num + " ");
            count++;
        }
    }
}
