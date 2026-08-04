public class FinanceApp {
    
    public static void main(String[] args) {
        
        // create the enum instance which is associated with one of the constants
        // it will pass the data values for that constant into the constructor for you to use
        CurrencyEnum myMoney = CurrencyEnum.EUR;

        // Print custom data attached to the enum
        System.out.println("Here is the enum instance that's been created:");
        System.out.println("Symbol: " + myMoney.getSymbol()); 
        System.out.println("Rate: " + myMoney.getExchangeRateToUSD());
        
        // Print the overridden toString() output
        System.out.println("Display: " + myMoney.toString()); 

        System.out.println("Here are all the values of the enum class:");
        for(CurrencyEnum ce : CurrencyEnum.values()){
            System.out.println(ce);
        }
        

    }
}

