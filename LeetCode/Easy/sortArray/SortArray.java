public class SortArray {

    public static void main(String[] args){

        //int[] nums = {1,2,2,3,4,5}; // Input array that will be sorted
        //int[] nums = {1,2,3,3,3,3}; // Input array that will be sorted
        int[] nums = {3,3,3,3,3,3}; // Input array that will be sorted
        int k; // the length of the array that is sorted

        SortArray sa = new SortArray();
        k = sa.removeDuplicates(nums);
        System.out.println("This is the length of the sorted numbers in the array: " + k);

    }

    public int removeDuplicates(int[] nums) {
        
        int dup;
        int totalDupCount = 0;
        int firstNumber = 0;

        if (nums.length == 0){
            return 0;
        }
        
        // loop through the total number of comparisons to make. x != position in array
        for (int x=0; x<(nums.length-1); x++){
                
            // if the 2 numbers are the same, make an adjustment
            if (nums[firstNumber] == nums[firstNumber+1]) {

                // increment dup count by 1
                totalDupCount++;

                // put the first value in an variable
                dup = nums[firstNumber+1];
                
                // shift the position by 1 each time
                for (int y=(firstNumber+1); y<(nums.length-1); y++){
                    nums[y] = nums[y+1];
                }

                // put the second number in the last position 
                nums[nums.length-1] = dup;
            }
            else{ // different numbers, increment the index of the next number to compare
                firstNumber++; // move to the next position in the array
            }
        } // for


        for (int z=0; z<nums.length; z++){
            System.out.println(nums[z]);
        }

        int sortedLength = nums.length-totalDupCount;

        return sortedLength;
    }
}
