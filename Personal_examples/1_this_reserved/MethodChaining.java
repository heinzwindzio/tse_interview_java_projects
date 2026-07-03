class WebRequest {
    private String url;
    private String method;

    // set method has a return type!
    public WebRequest setUrl(String url) {
        this.url = url;
        return this; // Returns the current object instance
    }

    // set method has a return type!
    public WebRequest setMethod(String method) {
        this.method = method;
        return this; // Returns the current object instance
    }

    public String getURL() {
        return url;
    }

    public String getMethod() {
        return method;
    }   
}


// How it is used:
// WebRequest req = new WebRequest().setUrl("example.com").setMethod("POST");
// instead of having to write multiple lines like this:
// WebRequest req = new WebRequest();
// req.setUrl("example.com");
// req.setMethod("POST");
public class MethodChaining{

    public static void main(String[] args){
        WebRequest req = new WebRequest();
        req.setUrl("example.com").setMethod("POST");
        System.out.println(req.getURL() + " " + req.getMethod());

    }
}



