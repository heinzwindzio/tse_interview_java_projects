
/**
 * Use 'this' to tell Java you want to assign the value to the class instance field
 */

public class ThisExample {
    private String name; // Instance variable

    public ThisExample(){
        // this has to be the first statement in the constructor
        this("Calling from the no argument constructor");  // constuctor chaining
    }

    public ThisExample(String name) {
        // 'this.name' refers to the instance variable
        // 'name' refers to the local constructor parameter
        this.name = name; 
    }

    public static void main(String[] args){

        ThisExample example1 = new ThisExample();
        System.out.println(example1.name);

        ThisExample example2 = new ThisExample("Created an instance of ThisExample and called the constructor with a String arg");
        System.out.println(example2.name);


        
        // Because this represents a specific object instance, you cannot use this inside 
        // static methods or static blocks. Static code belongs to the class itself, 
        // not to any individual object instance. Attempting to use it here will 
        // cause a compilation error.
        
        // this.name = "Compilation Error";
    }
}
