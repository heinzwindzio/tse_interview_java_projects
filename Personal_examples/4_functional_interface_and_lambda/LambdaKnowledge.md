Java lambda expressions are concise, anonymous functions used to 

*implement functional interfaces* (interfaces with exactly one abstract method) 

without boilerplate code


### Basic Syntax Styles

A lambda expression consists of three components: a parameter list, the arrow token `->`, and a body.

*   **Zero Parameters:** `() -> System.out.println("Hello");`
*   **Single Parameter:** `x -> x * x;` (Parentheses are optional for a single untyped parameter)
*   **Multiple Parameters:** `(a, b) -> a + b;`
*   **Block Body:** `(a, b) -> { int sum = a + b; return sum; };` (Requires explicit braces and a return statement)
