import java.util.*;

public class GenericsWithLists {
    
    public static void main(String[] args){

        /* YOU SHOULD ALWAYS USE GENERICS WITH COLLECTIONS, TO AVOID RUNTIME ERRORS */
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        // stringList.add(123); // ❌ Won't compile! Type is set as a String, so all Objects are entered as Strings

        /* 2D list of Strings */ 
        List<List<String>> listOfLists = new ArrayList<>(); 

        /* inheritance doesn't work, since generic types are invariant and don't inherit so can't cast to child */
        List<Number> listNums = Arrays.asList(1, 2, 3, 4); // create a new fixed list
        // for(Integer num : listNums){
        //     System.out.println(num);
        // }
        /* instead, use a wild card and PECS - SEE Wildcard.java examples */


        /* HERE'S WHY YOU SHOULD USE GENERICS */
        List list = new ArrayList(); // everything put in here will be created as an Object. So, need to cast it to a type when pulling it out
        list.add("Hello");
        list.add(123); // Compiler allows this, but given you don't know the type it can lead to hidden bugs
        String w = (String)list.get(0); // must cast it to a String
        int n = (int)list.get(1); // must cast it to an int
        System.out.println("This is what we grabbed: " + w + ", " + n);
        list.stream().forEach(System.out::println);

        Object word = list.get(0);
        String word2 = (String)list.get(0);
        
        // String num = (String)list.get(1); // ❌ Won't compile! Can't cast an Object to a String
        // int n = list.get(1);  // ❌ Won't compile! Can't cast an Object to an int
        Object num = list.get(1);
        Integer num2 = (Integer)list.get(1);

        System.out.println("These are the strings: " + word + ", " + word2 + ", " + num + ", " + num2);
   


   
    }


}
