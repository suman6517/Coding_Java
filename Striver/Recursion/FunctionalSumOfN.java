package Striver.Recursion;
//The Summation of first N numbers using Functional Recursion
public class FunctionalSumOfN
{
    public  static int Sum(int n)
    {
        if (n==1)
        {
            return 1;
        }
        return n+Sum(n-1);
    }

    public static void main(String[] args)
    {
        int n=5;
        System.out.println("The Sum of first n numbers is "+Sum(n));

    }
}
