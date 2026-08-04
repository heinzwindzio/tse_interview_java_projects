In Java, an **`enum` (short for enumeration)** is a special data type used to define a fixed, predefined set of constants. Enums are more than just a list of words.They are full-fledged classes. This means enums can have fields (variables), constructors, instance methods, and even abstract methods.

You should use an enum when a variable can only take one value from a predefined set of choices. Common examples include days of the week, compass directions, chess pieces, or order statuses.

You can associate data directly with each enum constant. To do this, define instance variables and create an enum constructor

Enums provide excellent type safety. Instead of using fragile integers (int STATUS_PENDING = 1) or raw text strings, enums ensure that invalid data cannot be passed to your methods. The Java compiler validates your code at compile time, reducing runtime errors.

Enums are declared using the enum keyword instead of class or interface. By convention, **enum constants** are written in uppercase letters.

Every Java enum automatically inherits special methods from the java.lang.Enum class (implicitely extended) or has them injected by the compiler.
* values(): Returns an array of all constants in the enum. Excellent for looping.
* valueOf(String name): Converts a string exactly into its matching enum constant.
* name(): Returns the exact string name of the constant.
* ordinal(): Returns the numerical position of the constant, starting at 0

Enums cannot be cloned or instantiated with new

In Java, enums are much more powerful than simple lists of words. They are full-fledged classes. This means enums can have fields (variables), constructors, instance methods, and even abstract methods.

### Key Characteristics

* **Type Safety**: You can only assign values explicitly declared by the enum type, catching invalid inputs at compile time.
* **Object Behavior**: Each enum constant is implicitly treated as a `public static final` object instance of that enum class.
* **Implicit Inheritance**: All enums automatically extend the `java.lang.Enum` class. Because Java does not support multiple inheritance, an enum cannot extend any other class, but it **can implement interfaces**.
* **No Instantiation**: You cannot create new instances of an enum using the `new` keyword.


