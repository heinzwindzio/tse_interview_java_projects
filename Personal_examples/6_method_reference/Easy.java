import java.util.function.Consumer;

public class Easy {
        
    public static void main(String[] args){
        
        // 1. Consumer - Takes one argument and returns no result (void)
        // Consumer<InputType>

        // Define the one abstract method of the functional interface using a lambda expression
        Consumer<String> printer1 = s1 -> System.out.println("In Lambda Method Logic. " + s1);
        printer1.accept("This is the String arg (s1) which passed to the interface's method defined in the lambda expression");

        // Define the one abstract method of the functional interface using a method reference
        Consumer<String> printer2 = Easy::printWithPrefix;
        printer2.accept("This is the String arg (s2) passed to the interface's method, which is defined below.");

        printWithPrefix("Just calling the method directly. ");
    }
   
    public static void printWithPrefix(String s2){
            System.out.println("In Defined Method Logic. " + s2);
    }
    
}


