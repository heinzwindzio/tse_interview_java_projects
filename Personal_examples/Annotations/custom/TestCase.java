public class TestCase {

    @MyCustomAnnotation(value = "Production Test", priority = 3)
    public void executeLogic() {
        
        System.out.println("Executing important logic...");
    }
}
