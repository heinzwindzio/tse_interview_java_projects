import java.util.function.Consumer;


// The Java Consumer interface is a built-in functional interface.
// It takes a single input argument, performs an action on it, and returns no result (void). 

public class ConsumerExample1 {
    public static void main(String[] args) {
        // 1. Define a consumer that accepts a String and prints it
        // it is accepting "message" here, which we know it is a String because Consumer is a generic class
        // The Lambda expression is like a method of the interface Consumer
        // that takes the single argument and prints it
        Consumer<String> greeter = message -> System.out.println("Hello, " + message);

        // 2. Use the accept() method to pass a single argument into the consumer
        greeter.accept("Alice");   // Output: Hello, Alice
        greeter.accept("Bob");     // Output: Hello, Bob
    }
}


