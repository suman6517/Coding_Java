package main.dsa.revise;

public class RecersiveEuclidGcd
{
    public static  int GCD(int a, int b)
    {
        if (b==0)
            return a;
        return GCD(b, a%b);
    }
    public static void main(String[] args)
    {
        int a=12;
        int b=15;
        System.out.println(GCD(a,b));

    }
}
