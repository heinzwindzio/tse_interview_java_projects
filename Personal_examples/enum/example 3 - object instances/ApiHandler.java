// Usage example:
public class ApiHandler {
    public void printResponse(HttpStatusCodeEnumClass status) {
        System.out.println("Response: " + status.getCode() + " - " + status.getDescription());
    }
}
