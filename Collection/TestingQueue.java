package Collection;


import java.util.LinkedList;
import java.util.Queue;

// It's a collection designed for holding elements prior to processing.
public class TestingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.offer(2);

        for (Integer i: queue){
            System.out.printf("%d ", i);
        }
        System.out.println( );
        System.out.println(queue.peek());
        System.out.println(queue.element());
    }

}
