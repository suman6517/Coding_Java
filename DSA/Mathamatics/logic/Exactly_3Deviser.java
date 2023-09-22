package DSA.Mathamatics.logic;

public class Exactly_3Deviser
{
    public static boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        for (int i=2; i<=Math.sqrt(n); i++)
            if (n%i==0)
                return false;
        return true;
    }
    public static int numOfDivider(int N)
    {
        int count=0;
        N=(int)Math.sqrt(N);
        for (int i=1; i<=N; i++)
        {
            if(isPrime(i))
                count++;
        }
        return count;

    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(numOfDivider(n));

    }
}
