import java.util.function.*;

public class BuiltInFunctionalInterfaces {
    
    public static void main(String[] args) {
        
        // 1. Consumer - Takes one argument and returns no result (void)
        // Consumer<InputType>
        Consumer<String> printer = s -> System.out.println("Printing: " + s);
        printer.accept("Functional Interfaces");

        
        // 2. Function - Takes one argument and returns a result
        // Function<InputType, OutputType>
        // Takes one argument and returns a result
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println("Length of 'Hello World': " + stringLength.apply("Hello World"));

        // Try it with different input, output types and different lambda expression logic
        Function<Integer, Integer> doubleIt = i -> i * 2;
        System.out.println("This is the output from Function.doubleIt(6): " + doubleIt.apply(6));
        System.out.println("This is the output from Function.doubleIt(7): " + doubleIt.apply(7));


        // 3. Predicate - Takes one argument and returns a boolean
        // Predicate<InputType>
        // Implement the functional interfaces using lambda expressions
        Predicate<String> isLongerThan5 = s -> s.length() > 5;
        System.out.println("Is 'Hello World' longer than 5? " + isLongerThan5.test("Hello World"));

        // Try it with a different input, and different lambda expression logic to return a boolean
        Predicate<Integer> isGreaterThan5 = i -> i > 5;
        System.out.println("Is 10 longer than 5? " + isGreaterThan5.test(10));


        // 4. BiFunction - Takes two arguments and returns a result
        // BiFunction<InputType1, InputType2, OutputType>
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        System.out.println("Result of 6 * 7: " + multiply.apply(6, 7));


        // 5. Supplier - Takes no arguments and returns a result
        // Supplier<OutputType>
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random value: " + randomValue.get());


    }

}
