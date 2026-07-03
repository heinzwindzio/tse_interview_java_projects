import java.util.List;
import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apple", "Banana", "Cherry");

        // the collection has a forEach(Consumer T) method that takes a Consumer as an argument
        // "fruit" is each String item from the Collection
        // pass a lambda expression matching the Consumer signature 
        names.forEach(fruit -> System.out.println("Eating: " + fruit));
    }
}

