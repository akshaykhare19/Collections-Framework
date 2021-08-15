import java.util.Set;
import java.util.TreeSet;

//Tree Set works on the principle of Binary Trees. It sorts the elements added to it.
//TIME COMPLEXITY - O(log n)

public class LearnTreeSet
{
    public static void main(String[] args)
    {
        Set<Integer> set = new TreeSet<>();

        //add(element) adds the element into the set
        set.add(8);
        set.add(5);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(6);
        set.add(7);
        set.add(1);
        set.add(10);
        set.add(11);

        System.out.println(set);

        //remove(element) removes and returns the specified element from the set
        set.remove(4);

        System.out.println(set);

        //isEmpty() checks whether the set is empty
        System.out.println(set.isEmpty());

        //size() returns size of the set
        System.out.println(set.size());

        //contains(element) checks whether the specified element is present in set
        System.out.println(set.contains(8));

        //clear() removes all the elements from the set
        set.clear();

        System.out.println(set);
    }
}