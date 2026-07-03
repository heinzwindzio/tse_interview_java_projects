public class DifferentVariables {
    private String name; // Instance variable

    public DifferentVariables(String name) {
        // this.name refers to the instance variable above
        // name refers to the parameter passed into the constructor
        this.name = name; 
    }

    public static void main(String[] args){
        DifferentVariables d = new DifferentVariables("Heinz");
        System.out.println(d.name);
    
    }
}
