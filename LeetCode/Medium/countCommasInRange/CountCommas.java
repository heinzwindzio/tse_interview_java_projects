public class CountCommas{   
    public static void main(String[] args) {

        long n = 1002;
        //long n = 998;
        
        System.out.println("This is the result: " + countCommas(n));
    }

    public static long countCommas(long n) {
        
        long numbersWithCommas = 0;
        
        String stringL = Long.toString(n);

        int len = stringL.length();

        int numCommas = len/3;

        // loop numCommas times
        for(int x=0; x<=numCommas; x++){

            // take next 3 digits 
            
            // multiply them times x (the comma number we're at)

        }

        return Math.toIntExact(numCommas); // throws an error if the int will be too big
    }
}
