/**
 * Demonstrates the @Documented annotation.
 *
 * This is just a dummy class to see how the javadoc works with and without the annotation
 */
@MyDocumentedAnnotation(author = "Heinz Service")
public class MyService {
    public void execute() {
        System.out.println("Executing secure service...");
    }
}

