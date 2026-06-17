public class Main {
    public static void main(String[] args) {
        // 1. Instantiate the handler class
        ApiHandler handler = new ApiHandler();

        // 2. Call the method using different enum instances
        handler.printResponse(HttpStatusCodeEnumClass.SUCCESS);
        handler.printResponse(HttpStatusCodeEnumClass.NOT_FOUND);
        handler.printResponse(HttpStatusCodeEnumClass.SERVER_ERROR);
    }
}
