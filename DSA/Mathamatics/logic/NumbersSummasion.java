package DSA.Mathamatics.logic;
// Summsion of n numbers;
public class NumbersSummasion
{
    public static  void SumssionNumber(int n,int sum)
    {
        if (n<1)
        {
            System.out.print(sum);
            return;
        }
       SumssionNumber(n-1, sum+n);

    }
    public static void main(String[] args)
    {
        SumssionNumber(3,0);
    }
}
