// An interface in Java is a blueprint of a class that specifies what a class must do, but not how it does it. 
// It contains abstract methods (methods without a body) that must be implemented by any class that signs the interface "contract".
interface Animal {
    void makeSound(); // Abstract method (has no body)
    void sleep();     // Abstract method
}

class Dog implements Animal {
    // The class MUST provide code for ALL interface abstract methods
    @Override
    public void makeSound() {
        System.out.println("The dog says: Woof Woof");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping: Zzz");
    }
}


public class Main {
    
    public static void main(String[] args){
        Dog animal = new Dog();
        animal.makeSound();
        animal.sleep();
    }

}
