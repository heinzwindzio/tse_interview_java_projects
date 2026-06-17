public enum HttpStatusCodeEnumClass {
    
    // each one of these are the instance of the enum
    // these are calls to the constructor of the enum below
    SUCCESS(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String description;

    // The constructor must be private
    private HttpStatusCodeEnumClass(int code, String description) {
        this.code = code;
        this.description = description;
    }

    // Public getters to access the stored data
    public int getCode() { return code; }
    public String getDescription() { return description; }
}
