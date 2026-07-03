
// You can use this() to invoke another constructor within the same class to reuse code and prevent duplication. 
// It must be the very first statement in the constructor.
public class ConstructorChaining {
    private String username;

    // can't make it final since it's being assigned later in the constructor
    // private final String role = "Member";
    private String role = "Member";

    // Constructor 1: Takes only one parameter
    public ConstructorChaining(String username) {

        // Calls Constructor 2, passing "Guest" as the default role
        // not sure why you can't just set it as a default variable as I've done above??
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

