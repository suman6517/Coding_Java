package DSA.Mathamatics.logic;

public class total_setbit
{
    public static int setCount(int n)
    {
        int count =0;
        if (n==0)
            return 0;
        while(n>0)
        {
            n= n & (n-1);
            count=count+1;

        }
        return count;
    }
    public static void main(String[] args)
    {
        int n=2;
        System.out.println(setCount(n));

    }
}
