public enum TrafficLightEnumClass {

    // public static final object instances of the enum class
    RED("Stop"), 
    YELLOW("Caution"), 
    GREEN("Go");

    // declare the variable for the constant
    private final String constantVar;

    // enums always have a private constructor
    // it is called when the constants are initialized at startup
    // must be private
    private TrafficLightEnumClass(String constantVar) {
        this.constantVar = constantVar;
    }

    // Public method
    public String getConstantVar() {
        return this.constantVar;
    }
}

