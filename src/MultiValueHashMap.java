import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class MultiValueHashMap {
    public static void main(String[] args) {
        // Create a HashMap with String keys and List<Integer> values
        HashMap<String, List<Integer>> map = new HashMap<>();

        // Add values to the map
        map.put("key1", new ArrayList<>());
        map.put("key2", new ArrayList<>());

        // Add multiple integer values to each key
        map.get("key1").add(1);
        map.get("key1").add(2);
        map.get("key2").add(3);
        map.get("key2").add(4);

        // Print the map
        System.out.println(map);
    }
}