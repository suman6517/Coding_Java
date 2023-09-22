package collection.example;

import java.util.HashSet;
import java.util.Set;

public class ExampleHashSet
{
    public static void main(String[] args)
    {

        // In set the Duplicate elements are not allowed ;
        // In Set the orders are not defined ;
        // .add() -- This method can add the element in HashSet;
        // .remove(Enter the element ) --This method can remove the element from a HashSet;
        // .contains(Enter a element) -- This method give us boolean value is an element present or not;
        // .isEmpty() -- This method can return us a boolean value is a HashSet is empty or not ;
        // .size() -- This method return uss the size of HashSet;
        // .clear() -- This method can clear the full HashSet;


        Set<Integer> set = new HashSet<>();

        set.add(50);
        set.add(60);
        set.add(70);
        set.add(80);
        set.add(90);
        System.out.println(set);

        set.remove(60);
        System.out.println(set);

        System.out.println(set.contains(80));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();
        System.out.println(set);

    }
}
