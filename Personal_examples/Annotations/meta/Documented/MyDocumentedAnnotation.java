import java.lang.annotation.Documented;

@Documented
public @interface MyDocumentedAnnotation {
    String author() default "Web Service";
}

