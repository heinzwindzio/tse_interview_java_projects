import java.util.*;

public class MyList {
 
    public static void main(String[] args) {


        // old way
        // can use primitive types
        // can use mixed types - but recommended using Objects
        // not fixed
        List fruits = new ArrayList();
        fruits.add("kiwi");
        String first = (String)fruits.get(0); // must cast Object to a String
        fruits.add(100);
        int second = (int)fruits.get(1); // must cast Object to an int
        System.out.println(first + second);
        fruits.stream().forEach(System.out::println);

        // still old way
        List<String> fruits2 = new ArrayList<String>();

        // new way
        List<String> fruits3 = new ArrayList<>();
        fruits3.add("Apple");
        fruits3.add("Mango");
        fruits3.stream().forEach(System.out::println);

        
        // immutable List
        List<Integer> immutableList = List.of(3, 6, 9, 12);
        // System.out.println(immutableList);
        System.out.print(immutableList.get(0));
        immutableList.stream().forEach(System.out::println);
        immutableList.add(15); // will throw an UnsupportedOperationException

        // immuntable List
        List<String> fruitsArray = Arrays.asList("f0", "f1");
        fruitsArray.stream().forEach(System.out::println);
        fruitsArray.add("f2"); // will throw an UnsupportedOperationException
    }
}
