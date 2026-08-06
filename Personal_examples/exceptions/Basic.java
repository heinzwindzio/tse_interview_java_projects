public class Basic {
   
    public static void main(String[] args){
        
        try {
            int result = 10 / 0; // Throws ArithmeticException

            System.out.println("This is the result of dividing by zero: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }

    }
}
