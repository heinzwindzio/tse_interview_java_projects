public class Main {
    public static void main(String[] args) {

        //calls the Airplane constructure, which calls the AbstractVehicle constructor using super()
        ConcreteAirplane myPlane = new ConcreteAirplane("Boeing 737");

        // Use the AbstractVehicle identity to call it's methods
        // remember, Airplane can override the methods
        // these methods are shared logic 
        AbstractVehicle vehicle = myPlane;
        vehicle.startEngine(); // Shared logic inherited from Vehicle
        vehicle.checkFuel();   // Specific logic from Airplane (method is abstract in AbstractVehicle))

        // Using FlyableInterface identify to call it's methods
        // remember Airplane can override the methods
        // these are simply capabilities defined by the interface
        FlyableInterface flyer = myPlane;
        flyer.takeOff(); 
        flyer.fly();
    }
}

