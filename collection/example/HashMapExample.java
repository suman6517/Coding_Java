package collection.example;
import java.util.HashMap;
import java.util.Map;
public class HashMapExample
{
    public static void main(String[] args)   
    {


        // List is specially for collecting the values and Map is specially for key value pairing ;
        // In Map the value can be same but the Key should be  different ;
        // .put() -- This method is for collecting the values and the element in Hash Map;
        // .putIfAbsent() -- Using this method if the key is already present then we can avoid the value ,
        // if we are not using it then the key override it's value;
        // .containsKey() -- Using this method we can get a boolean value that can tell us if a key is present or not ;
        // .containsValue() -- This method give us a boolean value that can tell us if a value is present or not;
        // .isEmpty() -- This method can tell us if the Map is empty or not in a boolean value ;
        // .clear() -- This method can empty the full map;
        // .remove(Enter the key) --Using this key we can remove any value or key using key;



        Map<String, Integer> number = new HashMap<>();

        number.put("One",1);
        number.put("Two",2);
        number.put("Three",3);
        number.put("Four",4);

        System.out.println(number);
        number.remove("One");

        number.putIfAbsent("Five",5);

        System.out.println(number);

        // Iterate a Map

        for (Map.Entry<String, Integer>e: number.entrySet())
        {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }
        // The other method for iterating the key values;
        for(String key : number.keySet())
        {
            System.out.println(key);
        }
        // The other method for iterating the values only;
        for (Integer value: number.values())
        {
            System.out.println(value);
        }
        System.out.println(number.containsKey("Two"));
        System.out.println(number.containsValue(2));

        System.out.println(number.isEmpty());

        number.clear();


    }
}
