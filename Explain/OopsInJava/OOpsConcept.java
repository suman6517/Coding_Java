package Explain.OopsInJava;
// Java Always provide a default Constructor ;
class Man  // Class
{
    int steps; //Properties of a class
    String name; //Properties of a class
    int age; //Properties of a class

    public void Legy() // Method
    {

    }


}
public class OOpsConcept
{

    public static void main(String[] args)
    {
        Man m1 = new Man();  // The Object ;
        m1.age=23;
        m1.steps=1000;
        m1.name="Suman";

        System.out.println(m1.age);

    }
}
