package DSA.Mathamatics.logic;

class Solution {
    public static int countPrimes(int n)
    {
        int count =0;
        if (n<=2)  // Checking for 0 & 1;
        {
            return 0;
        }

        boolean[] result = new boolean[n];
        int limit = (int)Math.sqrt(n);

        for (int i=2; i<=limit; i++)
        {
            if (!result[i])
            {
                for (int j= i*i; j<n; j+=i)
                {
                    result[j]=true;
                }
            }


        }

        for(int i=2; i<n; i++)
        {
            if (!result[i])
            {
                count= count +1;
            }

        }

        return count ;
    }

    public static void main(String[] args)
    {
        int n=10;
        boolean countPrimes;
        System.out.println(countPrimes(n));

    }

//    public int countPrimes(int n)
//    {
//        boolean[] notPrime = new boolean[n];
//        int count = 0;
//        for (int i = 2; i < n; i++)
//        {
//            if (notPrime[i] == false)
//            {
//                count++;
//                for (int j = 2; j * i < n; j++)
//                {
//                    notPrime[j * i] = true;
//                }
//            }
//        }
//        return count;
//  }

}