public class SortArray {

    public static void main(String[] args){

        int[] nums = {3,3,3,3,3}; // Input array that will be sorted
        int k; // the length of the array that is sorted

        SortArray sa = new SortArray();

        k = sa.removeDuplicates(nums);

        System.out.println("This is the length of the sorted numbers in the array: " + k);

    }

    public int removeDuplicates(int[] nums) {
        
        int dupCount = 0;
        int dup;
        int sequentialDupCount; // number of comparisons made
        
        // loop through the array
        for (int x=0; x<(nums.length-1); x++){

            // if we've reached the end of the unique numbers then break out of the loop
            if (x == (nums.length-dupCount)){
                break;
            }
                
            // if the 2 numbers are the same in the first compare, 
            if ( (nums[x] == nums[x+1]) && (x != nums.length-1) ){

                sequentialDupCount=0;

                // keep looping while the numbers are the same, and we haven't compared all the numbers
                while ( (nums[x] == nums[x+1]) && (sequentialDupCount <= (nums.length-1)-x) ){

                    sequentialDupCount++;

                    // increment dup count by 1
                    dupCount++;

                    // put the first value in an variable
                    dup = nums[x+1];
                    
                    // shift the position by 1 each time
                    for (int y=(x+1); y<(nums.length-1); y++){

                        nums[y] = nums[y+1];
                    }

                    // put the second number in the last position 
                    nums[nums.length-1] = dup;

                } // while
            }
        } // for


        for (int z=0; z<nums.length; z++){
            System.out.println(nums[z]);
        }

        int sortedLength = nums.length-dupCount;

        return sortedLength;
    }
}
