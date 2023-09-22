package collection.example;

import java.util.Arrays;

public class ExampleArrayClass
{
    public static void main(String[] args)
    {
        // In Array class if the Array is in a sorted order then we can use the binary search directly the
        // for the example follow the below example;
        // Using Arrays.sort() we can sort an Array example is in bellow;
        // Using Arrays.fill() we can fill an Array in one particular element ;

        int arr[] ={1,2,3,4,5,6,7,8,9};
        int index = Arrays.binarySearch(arr,4);
        System.out.println("The index of 4 in binarySearch is "+index);

        Integer number[]={10, 20,5,6,8,45,50};
       // Arrays.fill(number,12);
        Arrays.sort(number);
       for (int i: number)
       {
           System.out.print(i+" ");
       }

    }
}
