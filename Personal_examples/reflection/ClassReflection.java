import java.lang.reflect.Method;
import java.lang.reflect.Field;

/**
 * Reflection allows you to do things like grab a private field from another class, and either view or modify it! Very dangerous!!
 * 
 */
public class ClassReflection
 {
 
    private String name = "Heinz";
    private int age = 55;

    public void myMethod(){
        System.out.println("I'm in the method");
    }

    public void myMethod2(){
        System.out.println("I'm in the second method");
    }    

    public static void main(String[] args){

        System.out.println("This is a simple toString() call to String: ");
        System.out.println(s.toString());

        // before generics, casting a String to an Integer would throw a runtime error:
        try {
            Class s = String.class;
            System.out.println("This is the String class: " +s.getClass());
            
            System.out.println("These are the methods of String: ");
            for (Method m : s.getDeclaredMethods()){
                System.out.println(m.getName());
            }

            System.out.println("Thses are the fields of String: ");
            Field[] fs = s.getDeclaredFields();
            for (Field f : fs){
                System.out.println(f);
            }
            

        }
        catch (Exception e) {
            System.out.println(e);
        }





    }
}
