package main.dsa.revise;

public class AllDivisorOfANumberSortted
{
    public static void divisors(int n)
    {
        int i=1;
        for (i=1; i*i<=n; i++)
        {
            if(n%i==0)
            {
                System.out.println(i+" ");
            }
        }
        for(; i>=1; i--)
        {
            if(n%i==0)
            {
                System.out.println((n/i)+" ");
            }
        }
    }
    public static void main(String[] args)
    {
        int n=20;
        divisors(n);

    }
}
