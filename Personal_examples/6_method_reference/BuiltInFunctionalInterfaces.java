import java.util.function.*;

public class BuiltInFunctionalInterfaces {
    
    public static void main(String[] args) {

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
