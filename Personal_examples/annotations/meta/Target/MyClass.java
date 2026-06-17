import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 1. Define the custom annotation
@Target(ElementType.METHOD) // Restricts usage to methods only
@Retention(RetentionPolicy.RUNTIME) 
@interface ExecutionLog {
    String value() default "Executing action";
}

// 2. Apply the custom annotation
public class MyClass {

    // Valid: Applied directly to a method
    @ExecutionLog("This is the Annotation String for ExecutionLog.")
    public void createUser() {
        System.out.println("User created successfully.");
    }

    // INVALID: Uncommenting this line causes a compile-time error
    // @ExecutionLog("Not allowed on a field") 
    private String serviceName;

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.createUser();

    }
    }       

