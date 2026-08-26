// First parent interface
interface Printable {
    void print();
}

// Second parent interface
interface Scannable {
    void scan();
}

// Child interface extending BOTH parent interfaces
// CAN-DO relationship between MultiFunctionDevice and Printable and Scannable
interface MultiFunctionDevice extends Printable, Scannable {
    void fax();
}


********
// Parent class (Superclass)
class Vehicle {
    // Attribute
    protected String brand = "Ford";

    // Method
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

// Child class (Subclass) inheriting from Vehicle
// IS-A relationship between Car and Vehicle
class Car extends Vehicle {
    // Unique attribute for the child class
    private String modelName = "Mustang";

    public static void main(String[] args) {
        // Create an instance of the Car class
        Car myCar = new Car();

        // 1. Call the honk() method (Inherited from Vehicle)
        myCar.honk();

        // 2. Access the brand attribute (Inherited from Vehicle)
        // And the modelName attribute (Defined in Car)
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
