public abstract class AbstractVehicle {
    
    // Focuses on WHAT an object is. Defines common state and behavior.
    private String model;
    private boolean engineStarted;

    public AbstractVehicle(String model) {
        this.model = model;
    }

    // Shared common logic
    public void startEngine() {
        this.engineStarted = true;
        System.out.println(model + " engine started.");
    }

    // Every specific vehicle must define its own fuel type
    public abstract void checkFuel();
}


