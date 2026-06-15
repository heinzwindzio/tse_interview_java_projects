import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 1. Create a custom annotation that IS inherited
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface MyInheritedAnnotation {
    String value() default "This will pass down";
}

// 2. Create a custom annotation that IS NOT inherited
@Retention(RetentionPolicy.RUNTIME)
@interface MyStandardAnnotation {
    String value() default "This stays behind";
}

// 3. Apply both annotations to a Base Class
@MyInheritedAnnotation
@MyStandardAnnotation
class ParentClass {
}

// 4. Extend the Base Class (Subclass has no explicit annotations)
class ChildClass extends ParentClass {

    public void myMethod() {

        String name = "Faith";

        // Child class logic
        System.out.println(name + " said, Hey, I'm going to a grad party!");
    }

}

// 5. Test the inheritance behavior
public class Main {
    public static void main(String[] args) {
        // Query annotations present on the ChildClass
        boolean hasInherited = ChildClass.class.isAnnotationPresent(MyInheritedAnnotation.class);
        boolean hasStandard = ChildClass.class.isAnnotationPresent(MyStandardAnnotation.class);

        // Print results to console
        System.out.println("Does ChildClass have @MyInheritedAnnotation? " + hasInherited);
        System.out.println("Does ChildClass have @MyStandardAnnotation? " + hasStandard);

        String var = ChildClass.class.getDeclaredField(null)
    }
}

