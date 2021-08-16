import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Collections Class provide some extra functions to the collections

public class LearnCollectionsClass 
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();

        //adds element to the arraylist
        list.add(5);
        list.add(1);
        list.add(10);
        list.add(6);
        list.add(3);
        list.add(22);
        list.add(31);
        list.add(1);
        list.add(7);
        list.add(8);

        //returns the smallest element from collection
        System.out.println("Min Element: " + Collections.min(list));

        //returns the largest element from collection
        System.out.println("Max Element: " + Collections.max(list));

        //returns the frequency of an element
        System.out.println("Occurrences: " + Collections.frequency(list, 1));

        //sorts the collection in ascending order
        Collections.sort(list);

        System.out.println(list);
        
        //sorts the collection in descending order 
        Collections.sort(list, Comparator.reverseOrder());

        System.out.println(list);

    }
}
