import java.util.Arrays;

//Arrays Class basically contains different functions to be performed on an array

public class LearnArraysClass 
{
    public static void main(String[] args)
    {
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};

        //returns the index of the specified element in a sorted array using binary search
        //TIME COMPLEXITY - O(log n)
        int a = Arrays.binarySearch(numbers, 8);

        System.out.println("The number 8 is present at index " + a);

        //to print the complete array
        for(int e: numbers)
        {
            System.out.print(e + " ");
        }
        System.out.println();
        int arr[] = {2,5,1,3,7,13,6,87,33};

        //sorts the array in an optimized way
        Arrays.sort(arr);

        for(int e: arr)
        {
            System.out.print(e + " ");
        }

        System.out.println();

        //fills whole array with a single element
        //this can also be achieved by using loop
        Arrays.fill(arr, 10);

        for(int e: arr)
        {
            System.out.print(e + " ");
        }

    }    
}
