In Java, an **`enum` (short for enumeration)** is a special data type used to define a fixed, predefined set of constants. 

Under the hood, Java enums are actually a special type of class, making them far more powerful than basic integer constants used in other programming languages.

### Key Characteristics

* **Type Safety**: You can only assign values explicitly declared by the enum type, catching invalid inputs at compile time.
* **Object Behavior**: Each enum constant is implicitly treated as a `public static final` object instance of that enum class.
* **Implicit Inheritance**: All enums automatically extend the `java.lang.Enum` class. Because Java does not support multiple inheritance, an enum cannot extend any other class, but it **can implement interfaces**.
* **No Instantiation**: You cannot create new instances of an enum using the `new` keyword.
