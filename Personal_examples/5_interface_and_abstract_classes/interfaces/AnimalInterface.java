
// An interface in Java is a blueprint of a class that specifies what a class must do, but not how it does it. 
// It contains abstract methods (methods without a body) that must be implemented by any class that signs the interface "contract".
interface AnimalInterface {
    void makeSound(); // Abstract method (has no body)
    void sleep();     // Abstract method

    default void whine(String sound) { // Default method
        System.out.println("Here is the default sound: " + sound); 
    }

}
