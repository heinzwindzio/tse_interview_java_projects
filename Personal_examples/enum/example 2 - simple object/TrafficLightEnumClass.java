public enum TrafficLightEnumClass {

    // public static final object instances of the enum class
    RED("Stop"), 
    YELLOW("Caution"), 
    GREEN("Go");

    // declare the variable for the constant
    private final String action;

    // enums always have a private constructor
    // it is called when the constants are initialized at startup
    private TrafficLightEnumClass(String action) {
        this.action = action;
    }

    // Public method
    public String getAction() {
        return this.action;
    }
}

