public class Example1 {
    
    public static void main(String[] args) {

        int[] result = twoSum(new int[]{3, 2, 4}, 6);

        System.out.println("index 0: " + result[0]);
        System.out.println("index 1: " + result[1]);

    }


    public static int[] twoSum(int[] nums, int target) {

        int output[] = new int[2];

        for (int x=0; x<nums.length; x++) {
            System.out.println("In first for loop");

            for (int y=0; y<nums.length; y++){
                System.out.println("In second for loop");

                if (y!=x){
                    if ((nums[x] + nums[y]) == target){
                        System.out.println(x + "+" + y + "=" + target);

                        output[0]=x;
                        output[1]=y;

                        return output;
                    }
                }
            }
        }

        return output;
        
    }

}
