
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

// Multiple type parameters (parameters are in angle brackets): K for Key, V for Value
class Pair<K, V> {
  private K key;
  private V value;

  public Pair(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public void printPair() {
    System.out.println("Key: " + key + ", Value: " + value);
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

    // Using multiple parameters: String for Key, Integer for Value
    Pair<String, Integer> studentAge = new Pair<>("Heinz", 55);
    studentAge.printPair();
  }
}
    
