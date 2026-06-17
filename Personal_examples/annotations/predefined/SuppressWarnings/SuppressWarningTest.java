

public class SuppressWarningTest
{
    // When compiling, the compiler will throw the following "Note: SuppressWarningTest.java uses or overrides a deprecated API."
    // If we remove the comment and use this annotation, the code will NOT throw a warning
    //@SuppressWarnings({"checked", "deprecation"})
    public static void main(String args[])
    {
        DeprecatedTest d1 = new DeprecatedTest();
        d1.Display();
    }
}
