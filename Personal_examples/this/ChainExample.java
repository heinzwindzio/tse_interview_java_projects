public class ChainExample {
    private int value; // by default it's 0

    public ChainExample increment() {
        this.value++;
        return this; // Returns the current object
    }

    public void display() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        ChainExample obj = new ChainExample();

        // method calls return the object
        obj.increment().increment().display(); // Outputs: Value: 2
    }
}
