package Personal_examples.this_reserved;


// You can use this() to invoke another constructor within the same class to reuse code and prevent duplication. 
// It must be the very first statement in the constructor.
public class ConstructorChaining {
    private String username;
    private String role;

    // Constructor 1: Takes only one parameter
    public ConstructorChaining(String username) {
        // Calls Constructor 2, passing "Guest" as the default role
        this(username, "Guest"); 
    }

    // Constructor 2: Takes two parameters
    public ConstructorChaining(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public static void main(String[] args){
        ConstructorChaining cc = new ConstructorChaining("Heinz");
        System.out.println(cc.username + " " + cc.role);
    }
}

