public class DeprecatedTest
{

    public static void main(String args[])
    {
        DeprecatedMethod d1 = new DeprecatedMethod();

        //this calls a method that has the @Deprecated annotation, and compiler will throw a warning
        d1.display();
    }
}
