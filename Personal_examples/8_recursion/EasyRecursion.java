/**
 * Sum the numbers from n down to 1
 */

public class EasyRecursion{

    public static void main(String[] args){

        int num = 7;

        System.out.println("This is the sum of all the numbers from " + num + " down to 1: " + recursiveSum(num));
    }

    public static int recursiveSum(int num){

        
        if (num <= 1) { // 1) handle the base case, which doesn't call the method again recursively 
            
            System.out.println("It's 1");

            // java removes this method from the call stack
            return num;

        }
        else{ // 2) call the method recursively

            System.out.println("Here is num: " + num);

            // java adds this method to the call stack
            return num + recursiveSum(num - 1);
        }

    }
}