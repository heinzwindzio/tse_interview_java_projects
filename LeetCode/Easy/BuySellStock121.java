public class BuySellStock121 {
  
    public static void main(String[] args){
        
        int[] prices = {7, 1, 5, 3, 6, 4}; // instance variable;
        // {3,7,1,2}

        BuySellStock121 bss = new BuySellStock121();

        System.out.println("This is the max profit: " + bss.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        
        int minPrice;
        int delta = 0;
        int maxProfit = 0;

        // if only one value in the array, then return 0;
        if (prices.length == 1) {
            return maxProfit;
        }
        else{
            minPrice = prices[0]; // set the minimum to the first position
        }
        
        // loop through each number within the array
        for (int x=1; x<prices.length; x++){

            // check to see if the current price is lower than minPrice
            if (prices[x] < minPrice){
                minPrice = prices[x];
            }
            else{ // we have a higher number than minPrice

                // get delta between the minimum and the current number
                delta = prices[x] - minPrice;

                // if greater than maxProfit, then assign the new value to maxProfit
                if (delta > maxProfit){
                    maxProfit = delta;
                } 
            }
        } // end for
        return maxProfit;
    }
}
