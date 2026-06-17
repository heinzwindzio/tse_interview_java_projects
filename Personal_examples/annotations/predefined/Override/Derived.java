public class Derived extends Base{
    
     // This method is meant to override the method from Base
     // If we don't put this annotation here and misspell the method name, it will compile fine but won't override the method
     // If we put this annotation here and misspell, compiler will complain with the following and won't compile: 
     // "Derived.java:5: error: method does not override or implement a method from a supertype
     // @Override" 
     // Then you can't run Base, because it extends Derived which is not compiled
     @Override
     public void overriddenDisplay2()
     {
         System.out.println("Derived display()");
     }
}
