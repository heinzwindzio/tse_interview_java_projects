import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
        
        // 1. Create an IntStream using range (1 to 9)
        System.out.println("--- Filtering and Mapping ---");

        // method chaining
        IntStream.range(1, 10) 
                 .filter(n -> n % 2 != 0)  // Keep odd numbers
                 .map(n -> n * n)          // Square them
                 .forEach(System.out::println); 

        // 2. Aggregate operations (Sum)
        int sum = IntStream.of(5, 10, 15, 20).sum();
        System.out.println("\nSum of explicit values: " + sum);

        // 3. Statistical Analysis
        System.out.println("\n--- Summary Statistics ---");
        IntSummaryStatistics stats = IntStream.of(12, 34, 56, 78, 90).summaryStatistics();
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());
    }
}

