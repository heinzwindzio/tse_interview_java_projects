import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class FourKinds{

    public static void main(String[] args) {
        
        // create a mutable List
        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        // now print it using the List.forEach(Consumer Functional Interface) method
        System.out.println("method 1 - put arg into a static method");
        cars.forEach(str -> String.toString(str));
        
        
        //cars.forEach(System.out::println);

    }
}