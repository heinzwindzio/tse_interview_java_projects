
class Main {
    public static void main(String[] args) {

        // Implement the interface using an anonymous class
        MathOperation square = new MathOperation() {
            
            @Override
            public int operate(int a) {
                return a * a;
            }
        };
        System.out.println(square.operate(5)); 
        

        // Implementing the interface using a lambda expression
        MathOperation doubleIt = (a) -> a * 2;
        System.out.println(doubleIt.operate(5));
    }
}

@FunctionalInterface
public interface MathOperation {
    int operate(int a); // The single abstract method
}



