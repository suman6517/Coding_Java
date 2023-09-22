package collection.example;
import java.util.Comparator;
import java.util.PriorityQueue;
public class UsePriorityQueue
{
    public static void main(String[] args) {

        // In PriorityQueue Data Structure we can customarily define the priority for the elements;
        // PriorityQueue implements the methods of Queue Data Structures;
        // THis Data Structure acts like Min Heap;
        // Comparator.reverseOrder() -- Using this constructor we can reverse the Priority;

        PriorityQueue<Integer> pq =new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(100);
        pq.offer(5);
        pq.offer(25);
        pq.offer(50);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
