public class Main {
    
    public static void main(String[] args) {
        

        // Example of an array of ints
        int[] nums = new int[5];
        nums[0] = 3;
        nums[1] = 6;
        nums[3] = 0;    

        for (int x=0; x < nums.length; x++){
            System.out.println(nums[x]);
        }
        
        // Example of an array of Strings
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // Example of an array of Integers
        Integer[] numbers = {10, 20, 30};

        // Printing elements using a loop
        System.out.println("Fruits:");
        
        // use this if you need to know index or want to manipulate the array
        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Numbers:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

}
