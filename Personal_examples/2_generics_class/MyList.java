import java.util.*;

public class MyList {
 
    public static void main(String[] args) {


        // old way
        // can use primitive types
        // can use mixed types - but recommended using Objects
        List fruits = new ArrayList();
        fruits.add("kiwi");
        String first = (String)fruits.get(0); // must cast Object to a String
        System.out.println(first); 
        fruits.add(100);
        int second = (int)fruits.get(1); // must cast Object to an int
        System.out.println(second); 

        // still old way
        List<String> fruits2 = new ArrayList<String>();

        // new way
        List<String> fruits3 = new ArrayList<>();

        // 2. Adding elements
        fruits3.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // Duplicates allowed

        // 3. Positional access
        String firstFruit = fruits.get(0); // "Apple"

        // 4. Modifying an element
        fruits.set(1, "Mango"); // Replaces "Banana" with "Mango"

        // 5. Removing elements
        fruits.remove(0); // Removes element at index 0

        // 6. Checking size and presence
        int size = fruits.size(); // Returns 2
        boolean hasMango = fruits.contains("Mango"); // Returns true

        */
    }
}
