package Striver.Recursion;
// The Summation of first n numbers using Parameterize Recursion;
public class parametarizeSumOfN
{
    public static void Summasion(int n ,int sum)
    {
        if (n<1)
        {
            System.out.println(sum);
            return ;
        }
        Summasion(n-1,sum+n);
    }
    public static void main(String[] args)
    {
        int n=3;
        int sum=1;
        Summasion(n,sum);



    }
}
