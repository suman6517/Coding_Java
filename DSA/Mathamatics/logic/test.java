package DSA.Mathamatics.logic;

class test
{
    // method to print the divisors
    static void printDivisors(int n)
    {
        int i;
        for( i = 1; i * i < n; i++)
        {
            if (n % i == 0)
                System.out.print(i + " ");
        }
        if(i-(n/i)==1)
        {
            i--;
        }
        for(; i >= 1; i--)
        {
            if (n % i == 0)
                System.out.print(n / i + " ");
        }
    }

    // Driver method
    public static void main(String args[])
    {
        System.out.println("The divisors of 100 are: ");
        printDivisors(20);;
    }
}
