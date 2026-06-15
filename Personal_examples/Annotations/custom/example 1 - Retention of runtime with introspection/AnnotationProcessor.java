import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
        Class<TestCase> obj = TestCase.class;
        
        //loop through each of the methods in the class
        for (Method method : obj.getDeclaredMethods()) {

            System.out.println("This is the first method: " + method.toString());

            System.out.println("Checking to see if there is an annotation present");
            // Check if our custom annotation is present on the method
            if (method.isAnnotationPresent(MyCustomAnnotation.class)) {

                System.out.println("This method has an annotation: " + method.getName());

                MyCustomAnnotation annotation = method.getAnnotation(MyCustomAnnotation.class);
                System.out.println("This is the annotation: " + annotation.toString());
                System.out.println("Annotation Value: " + annotation.value());
                System.out.println("Annotation Priority: " + annotation.priority());
            }
        }
    }
}

