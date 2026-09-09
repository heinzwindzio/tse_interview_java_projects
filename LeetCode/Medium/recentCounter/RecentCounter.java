import java.util.List;
import java.util.ArrayList;


public class RecentCounter {

    public List<Integer> nums; 

    public RecentCounter() {
        nums = new ArrayList<Integer>();
    }
    
    public int ping(int t) {
        
        int counter=0;
        int hi=0;
        int lo=0;

        // add the number to the ArrayList
        nums.add(t);

        // calculate the high and low of the range, based on t
        hi = t;
        lo = t-3000;

        // loop through the array. if a number is within the range, then increase the count by one
        for( Integer num : nums){
            
            if ( (lo <= num) && (num <= hi) ){
                counter++;
            }
        }

        return counter;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
