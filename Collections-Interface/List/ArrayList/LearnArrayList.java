import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Arrays have a fixed size, hence ArrayList is a better option

//TIME COMPLEXITY
//Inserting -> O(n)
//Deleting -> O(n)
//Searching -> O(n)

//EXTRAS
//Whenever we write an object in System.out.println(), its 'toString()' gets invoked

public class LearnArrayList
{
    public static void main(String[] args)
    {
        //creates an empty array in memory
        ArrayList<String> studentName = new ArrayList<>();

        //when we add first element, it makes the array of size 10
        studentName.add("Akshay");

        //After further addition of elements in the array, when all the 10 positions 
        //get filled, it will create a new array of size 16, copy the data of old array
        //into this new array and dump the old array.

        //SIZE FLUCTUATIONS
        //if the current size of the array is [n], (like in above example, after adding first
        //element, the size becomes 10) on adding element at nth position, the new generated
        //array will be of size, [n + n/2 + 1], (like in above example, size becomes 
        //[10 + 10/2 + 1] = 16)

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //add(element) basically adds the element at the end of the arraylist
        list.add(4);
        System.out.println(list);
 
        //add(index, element) adds the element at the specified position of the arraylist
        list.add(1, 5);
        System.out.println("list -> " + list);

        List<Integer> newList = new ArrayList<>();
        newList.add(200);
        newList.add(201);
        newList.add(202);
        System.out.println("newList -> " + newList);

        //addAll(Collection) adds a whole list into another list at the end
        list.addAll(newList);
        System.out.println("Added List -> " + list);

        newList.add(300);
        newList.add(301);
        newList.add(302);
        System.out.println("Updated newList -> " + newList);

        //addAll(index, Collection) adds a whole list into another list at the specified positionfx
        list.addAll(3, newList);
        System.out.println("Added List at particular index -> " + list);

        //get(index) returns the element present at the specified index
        System.out.println(list.get(7));

        //remove(index) removes the element present at the specified position
        list.remove(2);
        System.out.println(list);

        //remove(object) removes the element present in the arraylist
        list.remove(Integer.valueOf(301));
        System.out.println(list);

        //clear() removes all elements from the list
        newList.clear();
        System.out.println("Empty newList -> " + newList);

        System.out.println("list -> " + list);

        //set(index, element) updates the value at the specified index
        list.set(3, 1000);
        System.out.println("New list -> " + list);

        //contains(element) returns true if element is present and false, if not
        System.out.println(list.contains(301));
        
        //One method to iterate in the list is for loop. 
        //size() returns the total no. of elements in the list
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println("Element is: " + list.get(i));
        }

        //One method is to use for-each loop
        for(Integer element: list)
        {
            System.out.println("foreach Element is: " + element);
        }

        //Another method is to use Iterator
        //hasNext() returns true if iteration has more elements
        //next() returns the next element in iteration
        Iterator<Integer> it = list.iterator();

        while(it.hasNext())
        {
            System.out.println("Iterator: " + it.next());
        }

    }
}