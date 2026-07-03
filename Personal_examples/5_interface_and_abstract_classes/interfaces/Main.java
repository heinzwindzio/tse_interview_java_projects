

class Dog implements AnimalInterface {
    // The class MUST provide code for ALL interface abstract methods
    @Override
    public void makeSound() {
        System.out.println("The dog says: Woof Woof");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping: Zzz");
    }

    @Override
    public void whine(String sound) {
        System.out.println("Overriding the interface: " + sound);
        
    }
}



public class Main {
    
    public static void main(String[] args){
        Dog animal = new Dog();
        animal.makeSound();
        animal.sleep();
        animal.whine("whine");
    }

}
