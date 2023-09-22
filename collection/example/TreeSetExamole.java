package collection.example;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamole
{
    public static void main(String[] args)
    {

        // It also implements the methods of Set;
        //It works in a sorted order;



        Set<Integer> ts = new TreeSet<>();
        ts.add(50);
        ts.add(60);
        ts.add(70);
        ts.add(80);
        ts.add(30);
        System.out.println(ts);

    }
}
