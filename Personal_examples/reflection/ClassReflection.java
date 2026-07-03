import java.lang.reflect.Method;
import java.lang.reflect.Field;

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



        // before generics, casting a String to an Integer would throw a runtime error:
        try {
            Class s = String.class;
            System.out.println(s.getClass());
            
 /** 
            for (Method m : s.getDeclaredMethods()){
                System.out.println(m.getName());
            }
*/

            Field[] fs = s.getDeclaredFields();
            for (Field f : fs){
                System.out.println(f);
            }
            
            s.toString();
        }
        catch (Exception e) {
            System.out.println(e);
        }





    }
}
