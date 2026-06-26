
// the angle brackets specify that there is a generic type in the class
// T is the type parameter
class Box<T> {

  //instance variable
  T value; // T is a placeholder for any data type

  void set(T value) {

    //this.value refers to the instance variable value
    this.value = value;
  }

  T get() {
    return value;
  }
}

public class SimpleClass {
  public static void main(String[] args) {
    
    // Create a Box to hold a any type
    // declare the box to hold a String
    Box<String> stringBox = new Box<>();
    stringBox.set("Hello");
    System.out.println("Value 1: " + stringBox.get());

    // Create a Box to hold an Integer
    Box<Integer> intBox = new Box<>();
    intBox.set(50);
    System.out.println("Value 2: " + intBox.get());
  }
}
    

