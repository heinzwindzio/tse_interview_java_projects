import java.lang.reflect.Method;

public class AnnotationParser {
    public static void main(String[] args) {
        try {
            // Reflectively load the class and method
            Class<?> clazz = PaymentService.class;
            System.out.println("This is the class: " + clazz.toString());

            Method method = clazz.getMethod("processTransaction");

            // Check if the annotation is present on the method
            if (method.isAnnotationPresent(ExecutionLimit.class)) {
                
                // Extract the annotation instance
                ExecutionLimit limit = method.getAnnotation(ExecutionLimit.class);
                
                // Read and print the runtime values
                System.out.println("Max Timeout: " + limit.maxTimeout() + "ms");
                System.out.println("Alert Msg  : " + limit.alertMessage());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
