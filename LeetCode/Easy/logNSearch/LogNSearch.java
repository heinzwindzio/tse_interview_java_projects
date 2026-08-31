

public class LogNSearch {
    
    public static void main(String[] args){

        int[] nums = {1,3,5,6};
        int target = 4;
        int result;

        LogNSearch lns = new LogNSearch();

        result = lns.searchInsert(nums, target);
        System.out.println("This is the result: " + result);

    }

    public int searchInsert(int[] nums, int target) {
        
        int mid=0;
        int low=0;
        int high= nums.length-1;
    

        // loop while low is less than high
        while (low<=high){

            // get the mid point
            mid = low + (high - low) / 2;

            // if the target equals the mid point then return the index
            if (target == nums[mid]){
                return mid;
            }

            // if the target is larger, then the low gets adjusted to the mid point unless number not found
            if (target > nums[mid]){
                low = mid+1;
            }
            
            if (target < nums[mid]){
                high = mid-1;
            }

        } // while

        // didn't find a number, so return the position it should be in
        if (target > mid){
            return mid+1;
        }
        else{
            return mid;
        }
    }
}
