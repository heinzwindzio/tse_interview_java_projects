import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyStreams {
    
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Alex", "Charlie");
        
        // filtering using filter()
        List<String> filteredNames = names.stream()
            .filter(name -> name.startsWith("A"))
            .toList(); // instead of collect(Collectors.toList())

        System.out.println(filteredNames); // Output: [Alice, Alex]

        // transforming data using map()
        List<String> words = List.of("hello", "stream", "api", "hello");
        List<String> upperWords = words.stream()
            .map(String::toUpperCase)
            .toList();
        System.out.println(upperWords); // Output: [HELLO, STREAM, API]
        
        List<String> modWords = upperWords.stream()
            .map(str -> {
                str = str + "!";
                System.out.println("added exclamation point!");
                return str;
            })
            .toList();
        System.out.println(modWords); // Output: [HELLO!, STREAM!, API!]

        // sorting data
        List<String> sortedWords = modWords.stream()
            .sorted()
            .toList();
        System.out.println(sortedWords); // Output: [API!, HELLO!, STREAM!]

        // eliminate duplicates
        List<String> uniqueWords = modWords.stream()
            .distinct()
            .toList();
        System.out.println(uniqueWords); // Output: [API!, HELLO!, STREAM!]

        // aggregating
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum = numbers.stream()
            .reduce(0, Integer::sum);
        System.out.println(sum); // Output: 15

        // to map
        Map<String, Integer> wordLengths = uniqueWords.stream()
            .collect(Collectors.toMap(word -> word, String::length));
        System.out.println(wordLengths); // Output: {hello=5, stream=6, api=3}
    }
}
