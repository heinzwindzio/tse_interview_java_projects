public class SortArray {
    
    public int[] nums; // Input array

    public SortArray(int[] nums){
        this.nums = nums;
    }

    
    public static void main(String[] args){

        int[] values = {1,1,1,2,3}; // Input array
        SortArray sa = new SortArray(values);

        int[] expectedNums = {1,2,3}; // The expected answer with correct length

        int k = sa.removeDuplicates(this.nums);

        assert k == expectedNums.length;

        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    public static int removeDuplicates(int[] nums) {
        
        // sort nums in place

        int sortedLength = 3;

        return sortedLength;
    }
}
