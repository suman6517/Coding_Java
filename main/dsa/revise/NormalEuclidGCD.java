package main.dsa.revise;

public class NormalEuclidGCD
{
    public static int GCD(int a, int b)
    {
        while (a!=0 && b!=0)
        {
            if(a>b)
                a=a%b;
            else
                b=b%a;
        }
        if (a!=0)
            return a;
        else
            return b;
    }

    public static void main(String[] args)
    {
        int a=12;
        int b=15;
        System.out.println(GCD(a,b));

    }
}
