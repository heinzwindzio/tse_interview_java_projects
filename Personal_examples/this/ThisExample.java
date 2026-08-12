public class ThisExample {
    private String name; // Instance variable

    public ThisExample(){
        // this has to be the first statement in the constructor
        this("The no argument constructor was called");
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
    }
}
