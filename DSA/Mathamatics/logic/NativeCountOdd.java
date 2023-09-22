package DSA.Mathamatics.logic;

public class NativeCountOdd
{
    public static int findOdd(int arr[], int n)
    {
       for (int i=0; i<n ; i++)
       {
           int count =0;
           for (int j=0; j<n; j++)
           {
               if(arr[i] == arr[j])
                   count++;
           }
           if(count % 2 != 0)

             return  arr[i];
       }
       return  0;
        //Most efficient Solution;
//        int res=0;
//        for (int i=0; i<n; i++)
//        {
//            res=res^arr[i];
//
//        }
//        return res;

    }
    public static void main(String[] args)
    {
        int arr[]= {4, 3, 4, 4, 4, 5, 5, 3, 3}, n = 9;

        System.out.println(findOdd(arr, n));

    }
}
