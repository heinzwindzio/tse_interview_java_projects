import java.util.function.*;


public class PredicateMethodReference {
    

    public static void main(String[] args) {
      
        // 3. Predicate - Takes one argument and returns a boolean
        // Predicate<InputType>
        // Implement the functional interfaces using lambda expressions
        // Predicate<String> isLongerThan5 = s -> s.length() > 5;
        
        // Implement the functional interface using a method reference:
        Predicate<String> isLongerThan5 = PredicateMethodReference::isLongerThanFive;
        System.out.println("Is 'Hello World' longer than 5? " + isLongerThan5.test("Hello World"));


    }

    private static boolean isLongerThanFive(String s){
        return s.length() > 5;
    }
}
