import java.util.HashMap;
import java.util.Map;


//Pairs HashMaps gets saved in random order
//TIME COMPLEXITY - O(1)

public class LearnHashMap
{
    public static void main(String[] args)
    {
        Map<Integer, String> numbers = new HashMap<>();

        numbers.put(1, "One");
        numbers.put(5, "Five");
        numbers.put(4, "Four");
        numbers.put(3, "Three");

        
        //By default, it overrides the changes in values
        numbers.put(3, "three");

        System.out.println(numbers);

        //we can stop overriding of values using this
        if(!numbers.containsKey(5)) numbers.put(5, "five");

        //another way to stop overriding of values
        numbers.putIfAbsent(4, "four");

        System.out.println(numbers);

        //removes the key-value pair of the specified key
        System.out.println(numbers.remove(5));

        //returns true if present, false if not
        System.out.println(numbers.containsKey(2));

        //returns true if present, false if not
        System.out.println(numbers.containsValue("One"));

        //returns true if empty, false if not
        System.out.println(numbers.isEmpty());

        //iteration through the map, controlling both, key and value
        for(Map.Entry<Integer, String> e : numbers.entrySet())
        {
            //iterates through the map, giving the key, value pair
            System.out.println(e);

            //iterates through the map, giving only the keys
            System.out.println(e.getKey());

            //iterates through the map, giving only the values
            System.out.println(e.getValue());
        }

        //iteration through map, controlling just keys
        for(int key: numbers.keySet())
        {
            System.out.println(key);
        }
        
        //iteration through map, controlling just values
        for(String value: numbers.values())
        {
            System.out.println(value);
        }

        //returns size of the Map
        System.out.println(numbers.size());

        //remove all elements from the Map
        numbers.clear();
        System.out.println(numbers);

        

    }
}
