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
        output.add(new ArrayList());

        

        for (int num : nums) {
            List<List<Integer>> newSubsets = new ArrayList();
            for (List<Integer> curr : output) {
                List<Integer> temp = new ArrayList(curr);
                temp.add(num);
                newSubsets.add(temp);
            }
            for (List<Integer> curr : newSubsets) {
                output.add(curr);
            }
        }
        return output;
    }
}
