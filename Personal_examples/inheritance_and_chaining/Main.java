public class Main {
    public static void main(String[] args){

        Profile anon = new Profile("janitor");
        anon.display();
        Profile dude = new Profile("Heinz", "Sr Manager");
        dude.display();
        
        String anonName = anon.setName("Wilfred").getName();
        anon.display();

        dude.setRole("Director").display();

    }
}

// package private class
class Client{

    private String name;

    public Client(String name){
        this.name = name;

    }

    public String getName(){
        return this.name;
    }

    // need to return 'this' for method chaining
    public Client setName(String name){
        this.name = name;
        return this;

    }
}

class Profile extends Client{

    private String role;

    // every subclass constructor must call super()
    public Profile(String role){
        super("Unknown");
        this.role = role;
    }

    // the subclass constructor must call super() with whatever args the parent class needs
    // no need to call it if it doesn't need any
    public Profile(String name, String role){
        super(name);
        this.role = role;
    }

    public String getRole(){
        return this.role;
    }

    public Profile setRole(String role){
        this.role = role;
        return this;
    }  

    public void display(){

        // calls the parent class method getName()
        System.out.println("Here is the Client name (from the parent method): " + getName());
        System.out.println("Here is the Client's profile role (from the child method): " + getRole());
    }
}
