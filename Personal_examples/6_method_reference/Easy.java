import java.util.function.Consumer;

public class Easy {
        
    public static void main(String[] args){
        
        // 1. Consumer - Takes one argument and returns no result (void)
        // Consumer<InputType>
        // Consumer<String> printer = s -> System.out.println("Printing: " + s);
        Consumer<String> printer = Easy::printWithPrefix;
        printer.accept("Suffix, ");
    }
   
    public static void printWithPrefix(String s){
            System.out.println("Prefix, " + s);
    }
    
}


