package collection.example;

import java.util.ArrayDeque;

public class ArrayDequeueExample
{
    public static void main(String[] args)
    {
        // In this Data Structure you can implement or pool elements from front and back both sides;
        // You will get all the methods of Queue in this Data Structure;
        // .offerFirst() -- Using this method you can add the element in the first position;
        // .offerLast() -- Using this method you can add the element in the Last position;
        // .pollFirst() -- Using this method we can remove the first element of Array Dequeue;
        // .peekFirst() --  Using this method we can see the first element of Array Dequeue to be removed ;
        // .pollLast() -- Using this method we can remove the Last element of Array Dequeue;
        //  .peekLast() --  Using this method we can see the Last element of Array Dequeue to be removed ;


        ArrayDeque<Integer> adq =new ArrayDeque<>();

        adq.offer(13);
        adq.offerFirst(50);
        adq.offer(100);
        adq.offer(200);
        adq.offerLast(500);

        System.out.println(adq);

        adq.pollFirst();
        System.out.println("pollFirst"+adq);

        System.out.println(adq.peekFirst());
        System.out.println(adq);

        adq.pollLast();
        System.out.println(adq);

        System.out.println(adq.peekLast());



    }
}
