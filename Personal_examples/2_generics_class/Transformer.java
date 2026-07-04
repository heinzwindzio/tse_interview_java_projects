
// 1. Define the class with 3 type parameters: I, M, O
public class Transformer<M, O, I> {
    
    private M modifier;

    public Transformer(M modifier) {
        this.modifier = modifier;
    }

    // 2. A method using the type parameters, returning type 'O'
    public String execute(I input) {
        System.out.println("Modifying input using: " + modifier);
        
        // For demonstration, we convert the combined inputs into a String.
        // In Java generics, the return value must match the declared type parameter.
        String result = "Input = " + input + ". Modifier = " + modifier;
        
        // Cast or return the specific type 'O'
        return result;
    }

        public static void main(String[] args) {
        // 3. Instantiate the class with concrete types: Integer, String, String
        // The method return type has to match the first symbols defined in the class header
        Transformer<String, String, Integer> myTransformer = new Transformer<>("AES-Encryption");

        // 4. Call the method with an Integer argument and catch the generic return value
        String finalOutput = myTransformer.execute(404);
        
        System.out.println("Result: " + finalOutput);
    }

}
