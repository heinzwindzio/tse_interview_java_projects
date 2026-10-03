import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // 1. Create a HashMap
        Map<String, Integer> inventory = new HashMap<>();

        // 2. Add elements using put(key, value)
        inventory.put("Apple", 50);
        inventory.put("Banana", 30);
        inventory.put("Orange", 20);

        // 3. Update a value (overwrites the existing key)
        inventory.put("Apple", 75); 

        // 4. Retrieve a value using get(key)
        int appleCount = inventory.get("Apple");
        System.out.println("Apple quantity: " + appleCount); // Output: 75

        // 5. Check if a key or value exists
        boolean hasGrapes = inventory.containsKey("Grapes"); // false

        // 6. Remove an element
        inventory.remove("Orange");

        // 7. Iterate through the Map
        System.out.println("\nCurrent Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

