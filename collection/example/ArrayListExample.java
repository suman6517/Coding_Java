package collection.example;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListExample
{
    public static void main(String[] args)
    {

        
        //Size increasing of an ArrayList suppose the size of then the Array is n;
        //then at first the size of this Array is 10 when that are all fulfilled then it will increase it's size ;
        //the increment size is ArrayList = (n+ n/2) +1;
        //Functions of ArrayList;

        // .add -- It directly add the elements;
        // .add(indexPosition , element) -- For add the element in a particular position;
        // .addAll() --It can add all elements of other Arraylist;
        // .get() --It is for get the value from an Arraylist;
        // .remove(enterTheIndex) -- To remove the element from a particular index;
        // .remove(Integer.valueOf(enterTheElement)) --To remove the integer element direct typing the element ;
        // .clear() -- To clear the full list;
        // .contains() --It will give the boolean value is the element present or not ;
        // .set(thePosition ,theValue) -- To set a particular value removing the existing element;



        List<Integer> example = new ArrayList<>();
        example.add(1);
        example.add(2);
        example.add(3);
        System.out.println(example);

        example.add(2,51);
        System.out.println(example);


        List<Integer> newexample = new ArrayList<>();
        newexample.add(58);
        newexample.add(60);
        newexample.add(61);
        example.addAll(newexample);
        System.out.println(example);

        int a = example.get(2);
        System.out.println(a);

        example.remove(2);
        System.out.println(example);

        example.remove(Integer.valueOf(2));
        System.out.println(example);

        example.set(1, 50);
        System.out.println(example);

        System.out.println(example.contains(50));

//        example.clear();
//        System.out.println(example);
//        Iterate a List;
        for (int i=0; i<example.size(); i++)
        {
            System.out.println(example.get(i));
        }
        // You can also use For-Each loop;
        for (int examples : example)
        {
            System.out.println("The element is "+examples);
        }
        // Using in collection Iterator class;
        Iterator<Integer> elements = example.iterator();
        while (elements.hasNext())
        {
            System.out.println("The elements are using Iterator methood "+elements.next());
        }



    }
}
