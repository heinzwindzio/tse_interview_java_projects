public class Main {
    public static void main(String[] args){

        String name = new Profile("Sr Manager").setName("Heinz").display();

        System.out.println("name: " + name);
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

    public void setName(String name){
        this.name = name;

    }
}

class Profile extends Client{

    private String role;

    public Profile(){
        super();
    }

    public Profile(String role){
        this.role = role;
    }

    public String getRole(){
        return this.role;
    }

    public void setRole(String role){
        this.role = role;
    }  

    public void display(){
        System.out.println("Here is the Client name: " + getName());
        System.out.println("Here is the Client's profile role: " + getRole());
    }
}
