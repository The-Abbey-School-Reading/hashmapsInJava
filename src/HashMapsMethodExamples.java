import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map;

public class HashMapsMethodExamples {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Alice", 90);
        map.put("Bob", 85);
        map.put("Charlie", 92);

        // Getting a value
        System.out.println("Alice's grade: " + map.get("Alice"));

        // Checking for a key
        System.out.println("Contains key 'Bob': " + map.containsKey("Bob"));

        // Checking for a value
        System.out.println("Contains value 85: " + map.containsValue(85));

        // Removing a key-value pair
        map.remove("Charlie");

        // Getting the size
        System.out.println("Size of the map: " + map.size());

        // Checking if the map is empty
        System.out.println("Is the map empty? " + map.isEmpty());

        // Getting the keys
        Set<String> keys = map.keySet();
        System.out.println("Keys: " + keys);

        // Getting the values
        Collection<Integer> values = map.values();
        System.out.println("Values: " + values);

        // Getting the entries
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("Entries: " + entries);
    }
}
