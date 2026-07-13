import java.util.*;
import java.util.stream.*;

/**
 * The Java Collections Framework provides a set of interfaces (like List, Set, and Map) 
 * and a set of classes (ArrayList, HashSet, HashMap, etc.) that implement those interfaces.
 * */



public class Main {
    
    /**  
    * read the : as 'in'
    * for (dataType variableName : arrayOrCollection) {
    *     Code block to be executed
    * }
    */

    public static void main(String[] args) {

            // Four major Collection Interfaces: Lists, Sets, Queues, Maps
 
            // Lists
            // Immutable List
            List<String> immutableNames = List.of("Alice", "Bob", "Charlie");

            List<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Alice"); // Duplicate
            names.add("Bob");
            names.add("Charlie");
            
            // read colon as 'in'. Name is the variable name
            for (String name : names) {
                System.out.println(name);
            }

            // let's try to print them up from a stream
            names.stream().forEach(System.out::println);
            
            // Sets - do not allow duplicates
            // HashSet doesn't guarantee any order
            Set<String> uniqueNames = new HashSet<>();
            uniqueNames.add("Alice");
            uniqueNames.add("Bob");
            uniqueNames.add("Charlie");

            for (String name : uniqueNames) {
                System.out.println(name);
            }

            // Queues - FIFO or LIFO
            Queue<String> nameQueue = new LinkedList<>();

            // Maps - key-value pairs
            // Hashmap doesn't guarantee any order
            Map<String, Integer> ageMap = new HashMap<>();
            ageMap.put("Alice", 25);
            ageMap.put("Bob", 30);
            ageMap.put("Charlie", 35);  

            for(String name : ageMap.keySet()) {
                int age = ageMap.get(name);
                System.out.println(name + ", " + ageMap.get(name));
            }   

            // let's try to print them up from a stream
            // need to get both key and value by calling entrySet()
            ageMap.entrySet().stream().forEach(System.out::println);

        }

    
}
