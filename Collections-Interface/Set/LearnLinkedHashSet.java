import java.util.LinkedHashSet;
import java.util.Set;

//It is same as HashSet, the only difference is that it keeps the elements in order
//whereas HashSet keeps them randomly

public class LearnLinkedHashSet
{
    public static void main(String[] args)
    {
        Set<Integer> set = new LinkedHashSet<>();

        //add(element) adds the element into the set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);

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