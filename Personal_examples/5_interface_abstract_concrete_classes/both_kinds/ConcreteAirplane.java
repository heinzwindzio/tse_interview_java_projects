// A concrete class in Java is any class that has a complete implementation of all its methods and 
// can be directly instantiated using the new keyword. Unlike abstract classes or interfaces, 
// a concrete class is 100% implemented, meaning it contains zero abstract (unimplemented) methods

// Airplane IS A Vehicle and CAN FLY
public class ConcreteAirplane extends AbstractVehicle implements FlyableInterface {
    
    public ConcreteAirplane(String model) {
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

