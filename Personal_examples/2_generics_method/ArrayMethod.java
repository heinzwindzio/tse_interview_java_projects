public class ArrayMethod {

  // This is a generic method. It works with any type (T)
  // The type can be any letter - T is just the convention
  public static <T> void printArray(T[] array) {
    
    // notice the type for each item pulled from the array is of type T
    for (T item : array) {
      System.out.println(item);
    }
  }

  public static void main(String[] args) {
    // Array of Strings
    String[] names = {"Jenny", "Liam"};

    // Array of Integers
    Integer[] numbers = {1, 2, 3};

    // Call the generic method with both arrays
    printArray(names);
    printArray(numbers);
  }
}
    
