import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Specifies WHERE the annotation can be applied (e.g., METHODS, FIELDS, CLASSES)
@Target({ElementType.METHOD, ElementType.FIELD}) 
// Specifies HOW LONG the annotation stays available (RUNTIME makes it readable via reflection)
@Retention(RetentionPolicy.RUNTIME) 
public @interface MyCustomAnnotation {
    
    // Elements act like methods but represent parameters
    String value() default "Default Info"; 
    int priority() default 1;
}