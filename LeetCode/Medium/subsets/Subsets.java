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

            // instantiate a 2D List to return
            List<List<Integer>> output = new ArrayList();

            // add a null value to the List
            output.add(new ArrayList());

            // loop over each number in the array
            for (int num : nums) {

                // create a List of Lists for the new subsets created by appending the current number
                List<List<Integer>> newSubsets = new ArrayList();

                // loop over the whole output List, adding the latest number to each List
                for (List<Integer> curr : output) {

                    // create a new temp List and copy all numbers in the current list to it
                    List<Integer> temp = new ArrayList(curr);

                    // add the array number to the temp list
                    temp.add(num);

                    // add the temp list to the new subsets list
                    newSubsets.add(temp);
                }

                // loop over the new subsets created and add them to the output
                for (List<Integer> curr : newSubsets) {
                    output.add(curr);
                }
            }
            return output;
        }
          
  /* 
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> output = new ArrayList<>(); // instantiate the resulting list of lists
        output.add(new ArrayList());  // add a List to the first position of the output


        // iterate through the array of numbers
        for (int i=0; i<nums.length; i++){

            // loop through the remaining numbers 
            for (int j=i; j<nums.length; j++){

                List<Integer> sublist = new ArrayList<>(); 

                sublist.add(nums[j]);
            }

            lol.add(sublist);

        }

        return output;
        
    }
        */
      

    
}
