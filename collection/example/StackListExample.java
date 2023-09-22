package collection.example;
import java.util.Stack;

public class StackListExample
{
    public static void main(String[] args)
    {
        // Stack is a Last in First Out type data structure;
        // .push() --Using this method we can add elements ;
        // .peek() --Using this method we can see which element is in the top;
        // .pop() -- Using this method we can remove the top element;


        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Snake");

        System.out.println(animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals.peek());

    }
}
