package main.dsa.revise;

public class LcmRecursive
{
    public static int GCD(int a, int b)
    {
        if (b==0)
            return a;
        return GCD(b,a%b);
    }
    public static int LCM(int a, int b)
    {
        return a*b/GCD(a,b);
    }

    public static void main(String[] args)
    {
        int a=4;
        int b=6;
        System.out.println(LCM(a,b));

    }
}
