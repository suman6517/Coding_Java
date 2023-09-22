package DSA.Mathamatics.logic;
//Print your name using Recursion N times;
public class PrintName
{
    static void printN(int i,int n)
    {
        if (i>n)
            return;
        System.out.println("Suman Baral");
        printN(i+1,n);


    }

    public static void main(String[] args)
    {
        int n=5;
        int i=1;
        printN(i,n);

    }
}
