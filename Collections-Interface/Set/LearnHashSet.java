import java.util.HashSet;
import java.util.Set;

//Set is like a bag of elements. They can be randomly placed in the bag.
//Duplication of elements is not allowed here, bcz a unique hash is generated for each element.

//TIME COMPLEXITY - O(1)

public class LearnHashSet
{
    public static void main(String[] args)
    {
        Set<Integer> set = new HashSet<>();

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