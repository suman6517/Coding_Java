package main.dsa.revise;

import java.util.Arrays;

public class SliveAlghorithomToFIndPrime
{
     static void sieve(int n)
    {
        boolean[] isPrime= new boolean[n+1];
        Arrays.fill(isPrime, true);
        for (int i=2; i<=Math.sqrt(n); i++)
        {
            if(isPrime[i])
            {
                for (int j=2*i; j<=n; j=j+i)
                {
                    isPrime[j]=false;
                }
            }
        }
        for(int i = 2; i<=n; i++)
        {
            if(isPrime[i])
                System.out.print(i+" ");
        }
    }
    public static void main(String[] args)
    {
        int n=10;
        sieve(n);



    }
}
