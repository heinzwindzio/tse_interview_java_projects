import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
        Class<TestCase> obj = TestCase.class;
        
        for (Method method : obj.getDeclaredMethods()) {
            // Check if our custom annotation is present on the method
            if (method.isAnnotationPresent(MyCustomAnnotation.class)) {
                MyCustomAnnotation annotation = method.getAnnotation(MyCustomAnnotation.class);
                
                System.out.println("Found method: " + method.getName());
                System.out.println("Annotation Value: " + annotation.value());
                System.out.println("Annotation Priority: " + annotation.priority());
            }
        }
    }
}

