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

        // List.stream.map(Function)
        System.out.println("method 1 - reference to a static method");
        cars.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList());          // the car is passed to parseInt(car)
        System.out.println(cars); 

        // List.forEach(Consumer) 
        // you can't change (add or remove) items using forEach...and it's hard to change the values
        System.out.println("method 2 - reference to an instance method");
        cars.forEach(System.out::println);

        // List.stream.filter(Predicate)
       long num = cars.stream()
            .filter(String::isEmpty)
            .count();
        System.out.println("Here are the number of strings that are empty: " + num);
        
        ArrayList<String> dupList = cars.stream()
                                    .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Here's the duplicate list: ");
        dupList.forEach(System.out::println);

    }
}