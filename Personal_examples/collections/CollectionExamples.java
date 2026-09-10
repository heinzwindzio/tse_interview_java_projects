import java.util.*;
import java.util.stream.*;

/**
 * The Java Collections Framework provides a set of interfaces (like List, Set, and Map) 
 * and a set of classes (ArrayList, HashSet, HashMap, etc.) that implement those interfaces.
 * */



public class CollectionExamples {
    
    /**  
    * read the : as 'in'
    * for (dataType variableName : arrayOrCollection) {
    *     Code block to be executed
    * }
    */

    public static void main(String[] args) {

            // Four major Collection Interfaces: Lists, Sets, Queues, Maps
 

            // LISTS 

            // mutable List
            List<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Alice"); // Duplicates allowed
            names.add("Bob");
            names.add("Charlie");
            names.set(1, "Allllll");  // will not change it at runtime
            
            // read colon as 'in'. Name is the variable name
            for (String name : names) {
                System.out.println(name);
            }

            // let's try to print them up from a stream
            names.stream().forEach(System.out::println);

            // fixed size List
            List<String> fixedSizedList = Arrays.asList("f0", "f1"); // this makes it fixed size
            fixedSizedList.stream().forEach(System.out::println);
            //  fixedSizedList.add("f2"); // will throw an UnsupportedOperationException
            
            // Immutable List
            List<String> immutableNames = List.of("Alice", "Bob", "Charlie");
            // immutableNames.set(1, "Allllll");  // will through an UnsupportedOperationException


            // SETS - do not allow duplicates

            // HashSet doesn't guarantee any order
            Set<String> uniqueNames = new HashSet<>();
            uniqueNames.add("Alice");
            uniqueNames.add("Bob");
            uniqueNames.add("Charlie");

            for (String name : uniqueNames) {
                System.out.println(name);
            }


            // QUEUES - FIFO or LIFO

            Queue<String> nameQueue = new LinkedList<>();


            // MAPS - key-value pairs

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
