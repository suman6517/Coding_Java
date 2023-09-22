package collection.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleCollectionClass
{
    public static void main(String[] args)
    {

        //In th collections class we can do various of things like we can sort a List we can check the min value
        // we can check the max value , we can check the frequency of a particular element , we can sort a List ;
        List<Integer> ar= new ArrayList<>();
        ar.add(5);
        ar.add(3);
        ar.add(7);
        ar.add(6);
        ar.add(12);
        ar.add(1);
        System.out.println("The Minimum value in the Arraylist is "+ Collections.min(ar));
        System.out.println("The Maximum value in the Arraylist is "+ Collections.max(ar));
        System.out.println("Frquency "+Collections.frequency(ar,3));

        Collections.sort(ar);
        System.out.println(ar);


    }
}
