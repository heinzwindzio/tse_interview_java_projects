import java.lang.annotation.Documented;

// This annotation (MyDocumentedAnnotation) will be included in javadocs
@Documented
public @interface MyDocumentedAnnotation {
    String author() default "Web Service";
}

