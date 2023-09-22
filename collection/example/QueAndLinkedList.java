package collection.example;

import java.util.LinkedList;
import java.util.Queue;

public class QueAndLinkedList
{
    public static void main(String[] args)
    {
        // Linked List can implement two interfaces  Queue and List interface;
        // Queue is a first in first out type of Data Structure ;
        // Queue can be implemented by Linked List , Array List , and Priority Queue;
        // .offer() -- Using this method you can add any element in the Queue;
        // .poll() -- Using this method we can remove the first element ;
        // .peek() -- This method can tell you which element would be remove int the next time ;
        //  For LinkedList methods you can follow the methods of ArrayList;


        Queue<Integer> notice = new LinkedList<>();

        notice.offer(5);
        notice.offer(25);
        notice.offer(50);
        System.out.println(notice);

        System.out.println(notice.poll());

        System.out.println(notice);

        System.out.println(notice.peek());


    }
}
