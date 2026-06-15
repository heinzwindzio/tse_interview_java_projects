import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.METHOD)        
public @interface ExecutionLimit {
    int maxTimeout() default 100000; 
    String alertMessage() default "You are good no worries";         
}
