import java.util.function.*;
import java.util.stream.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionMethodReference {
    
    public static void main(String[] args) {

        // 2. Function - Takes one argument and returns a result
        // Function<InputType, OutputType>
        // Takes one argument and returns a result

        // With lambda expression using an existing method:
        // Function<String, Integer> stringLength = s -> s.length();
        //Function<String, Integer> stringLength = String::length;
        //System.out.println("Length of 'Hello World': " + stringLength.apply("Hello World"));


        // Try it with different input, output types and a lambda expression:
        // Function<Integer, Integer> doubleIt = i -> i * 2;

        // With method reference - can't use an expression, need to use an existing method
        // Let's implement Function and call it 'doubleIt'...
        Function<Integer, Integer> doubleIt = FunctionMethodReference::doubleValue;
        System.out.println("This is the output from Function.doubleIt(6): " + doubleIt.apply(6));
        System.out.println("This is the output from Function.doubleIt(7): " + doubleIt.apply(7));
        

        // Why write it like this? 
        // Try just calling the method...
        System.out.println("This is the output from a direct static method call: " + FunctionMethodReference.doubleValue(9));
        
        
        // However, we can pass the Function interface, 'doubleIt', to other methods like Streams:
        // List is a generic interface, and must be implemented by a generic concrete class
        // ArrayList: A concrete class that implements the List interface. It contains the actual 
        //   implementation logic using a resizable array under the hood. Also, no need to use
        //   'new' since asList is a static method of Arrays
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> results = numbers.stream().map(doubleIt).collect(Collectors.toList());
        System.out.println("Transformed list using doubleIt: " + results);

    }

    private static Integer doubleValue(Integer i) {
        return i * 2;
    }

}




