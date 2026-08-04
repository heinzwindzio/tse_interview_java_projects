public enum CurrencyEnum {
    
    //  When you define the constants, you give it the data to pass into the private constructor
    USD("$", 1.0),
    EUR("€", 0.92),
    GBP("£", 0.78);

    // 2. Define final fields
    private final String symbol;
    private final double exchangeRateToUSD;

    // 3. Create the private constructor
    private CurrencyEnum(String symbol, double exchangeRateToUSD) {
        this.symbol = symbol;
        this.exchangeRateToUSD = exchangeRateToUSD;
    }

    // 4. Create public getter methods
    public String getSymbol() {
        return symbol;
    }

    public double getExchangeRateToUSD() {
        return exchangeRateToUSD;
    }
    
    // 5. Override toString() if you want a custom text representation
    @Override
    public String toString() {
        return name() + " (" + symbol + ")";
    }
}

