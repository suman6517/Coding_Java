package collection.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSeet
{
    public static void main(String[] args)
    {

        // LinkedHashSet Implements the properties of Set and also the properties of LinkedList;
        // To see other methods follow the methods of set and Linked List;
        Set<Integer> lhs =new LinkedHashSet<>();
        lhs.add(50);
        lhs.add(60);
        lhs.add(70);
        lhs.add(80);
        lhs.add(90);
        System.out.println(lhs);

    }




}
