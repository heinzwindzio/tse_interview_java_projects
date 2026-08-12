public class MultiCatchBlock {
    
    public static void main(String[] args){
        try {
        int[] numbers = new int[2];
        //numbers[5] = Integer.parseInt("not_a_number");
        numbers[5] = Integer.parseInt("2");
        
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) { // e is for either exception
            System.out.println("An array or number error occurred. Here is the error: " + e.getMessage());
        }
    }
}
