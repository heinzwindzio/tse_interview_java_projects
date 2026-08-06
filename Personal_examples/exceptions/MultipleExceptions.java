public class MultipleExceptions {
    
    public static void main(String[] args){

        try {
            
            int[] numbers = new int[2];
            numbers[5] = Integer.parseInt("2"); //will only catch the first exception it encounters
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds!");
        }

    }
}
