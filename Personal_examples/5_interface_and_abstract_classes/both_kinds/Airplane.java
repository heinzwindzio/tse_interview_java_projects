package both_kinds;

// Airplane IS A Vehicle and CAN FLY
public class Airplane extends AbstractVehicle implements FlyableInterface {
    
    public Airplane(String model) {
        super(model);
    }

    // Implementing Abstract Class method
    @Override
    public void checkFuel() {
        System.out.println("Checking aviation biofuel levels.");
    }

    
    // Implementing Interface methods
    @Override
    public void takeOff() {
        System.out.println("Airplane accelerates down the runway and lifts off.");
    }

    @Override
    public void fly() {
        System.out.println("Airplane cruising at 35,000 feet.");
    }

    @Override
    public void land() {
        System.out.println("Airplane deploys landing gear and touches down.");
    }
}

