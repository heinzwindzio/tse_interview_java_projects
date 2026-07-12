import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class FourKinds{

    public static void main(String[] args) {
        
        // create a mutable List
        List<String> cars = new ArrayList<>();
        cars.add("1");
        cars.add("2");
        cars.add("3");

        // now print it using the List.forEach(Consumer Functional Interface) method
        // you can't change (add or remove) items in the List...but you can mutate them
        System.out.println("method 1 - put arg into a static method");
        cars.forEach(str -> {
            str.setName(str.getName() + ":number");
        });
        System.out.println("now with method reference");
        cars.forEach(System.out::println);
        
        
        //cars.forEach(System.out::println);

    }
}