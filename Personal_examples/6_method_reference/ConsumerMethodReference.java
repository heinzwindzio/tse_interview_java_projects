import java.util.function.*;

// Method references are syntactic sugar for lambda expressions that are calling an existing method
// method. 
public class ConsumerMethodReference {
    
    public static void main(String[] args) {
        
        // 1. Consumer - Takes one argument and returns no result (void)
        // Consumer<InputType>

        // with lambda expression:
        // Consumer<String> printer = s -> System.out.println("Printing: " + s);
        
        // with colon operator:
        Consumer<String> printer = System.out::println ;
        printer.accept("Calling a Functional Interfaces using method reference"); 
    }
    
}
