import java.util.ArrayList;
import java.util.List;

public class Subsets {
    
    public static void main(String[] args){

        int[] nums = {1, 2, 3};

        Subsets ss = new Subsets();

        List<List<Integer>> lol = ss.subsets(nums);

        for (List<Integer> sublist : lol){
            for (Integer num : sublist){

                System.out.print(num);
            }
            System.out.println();
        }

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList();
        // output.add(new ArrayList()); // better way to create a second List and add it to the first List
        
        List<Integer> test = new ArrayList(); // create an empty List

        output.add(test); // if you add an empty List to a List, it is just an empty List,NOT a null

        System.out.println(output.size());       // Prints: 1 (It contains one item)
        System.out.println(output.get(0));       // Prints: [] (The empty list)
        System.out.println(output.get(0) == null); // Prints: false (It is not null!)

        // loop through the numbers
        for (int num : nums) {

            // create a new 2D List to hold the new values
            List<List<Integer>> newSubsets = new ArrayList();

            // loop through the OG 2D List, grabbing a List of numbers each iteration
            for (List<Integer> curr : output) {

                // create a temp List to hold the new values
                List<Integer> temp = new ArrayList();

                // copy all of the values over to the temp List
                temp.addAll(curr);

                // append the new number to the temp List
                temp.add(num);

                // add the temp List to the new 2D List
                newSubsets.add(temp);
            }

            // newSubsets is ready to be appended to the OG List
            output.addAll(newSubsets);

            /* 
            for (List<Integer> curr : newSubsets) {
                output.add(curr);
            }
            */
           
        }
        return output;
    }
}
