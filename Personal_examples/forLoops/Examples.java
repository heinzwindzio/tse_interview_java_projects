import java.util.List;

public class Examples {
    
    public static void main(String[] args){

        List<String> items = List.of("Apple", "Banana", "Cherry");

        // Simple for loop
        for (String item : items) {
            System.out.println(item);
        }

        /*
        * Iterable.forEach()
        * default void forEach(Consumer<? super T> action)
        * 
        * Parameter: A java.util.function.Consumer object representing the action 
        * to be performed on each element.Return Value: void (it does not return anything)
        */
        items.forEach(item -> System.out.println(item)); // use a lambda function to implement the functional interface with one abstract method

        items.forEach(System.out::println); // use a method reference
    }
}
