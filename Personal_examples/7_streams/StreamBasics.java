import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasics {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        // filter(predicate)
        // map(function)
        // method reference must reference an existing method (whether core or created)
        List<String> stringNumbersStream = numbers.stream()
            .map(num -> "Number " + num) // Lambda expression transformation
            .collect(Collectors.toList());
        System.out.println(stringNumbersStream); // Output: ["Number 1", "Number 2", "Number 3"]

        
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Anna");
        // Filter names starting with 'A', convert to uppercase, and collect
        List<String> result = names.stream()
                                   .filter(name -> name.startsWith("A"))
                                   .map(String::toUpperCase)
                                   .toList(); // Available since Java 16
        System.out.println(result); // Output: [ALICE, ANNA]

        
        List<Integer> tens = Arrays.asList(10, 20, 30, 200, 2000);
        // Filter tens for numbers that begin with '2', then convert to string, then append them
        List<String> endResult = tens.stream()
                                   .filter(ten -> ten > 200)
                                   .map(num -> "Number > 200 = " + num)
                                   .map(n -> n.toUpperCase())
                                   .toList(); // Available since Java 16
        System.out.println(endResult); // Output: [ALICE, ANNA]

        List<Integer> hundreds = Arrays.asList(100, 200, 300);
        List<String> hundredConverted = hundreds.stream()
                                            .map(hun -> hun.toString())
                                            .toList();
        System.out.println(hundredConverted);

        /** 
        Integer i = 3;
        String s = i + " hello"; // Object + String returns a String
        System.out.println(s);
        */

        List<Integer> oddsIntegers = Arrays.asList(1, 3, 5);
        List<String> oddsConverted = hundreds.stream()
                                            .map(hun -> hun.toString())
                                            .map(String::trim)
                                            .map(String::concat("Heinz"))
                                            .toList();
        System.out.println(hundredConverted);
        
    }
}
