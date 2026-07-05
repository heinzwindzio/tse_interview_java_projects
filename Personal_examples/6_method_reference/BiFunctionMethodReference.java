import java.util.function.*;


public class BiFunctionMethodReference {
    
    public static void main(String[] args) {
        
        // 4. BiFunction - Takes two arguments and returns a result
        // BiFunction<InputType1, InputType2, OutputType>

        // Using a lambda expression
        // BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

        // Using a method reference
        BiFunction<Integer, Integer, Integer> multiply = BiFunctionMethodReference::multiply;   
        System.out.println("Result of 6 * 7: " + multiply.apply(6, 7));

    }

    private static Integer multiply(Integer a, Integer b) {
        return a * b;
    }       
}
