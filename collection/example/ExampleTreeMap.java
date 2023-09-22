package collection.example;

import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap
{
    public static void main(String[] args)
    {
         // Tree Map always sort the Key Map;
        // For more method you can follow the Hash Map Methods ;


        Map<String,Integer> tm = new TreeMap<>();

        tm.put("One",1);
        tm.put("Two",2);
        tm.put("Three",3);
        tm.put("Four",4);
        tm.put("Five",5);

        System.out.println(tm);

    }
}
