class WebRequest {
    private String url;
    private String method;

    public WebRequest setUrl(String url) {
        this.url = url;
        return this; // Returns the current object instance
    }

    public WebRequest setMethod(String method) {
        this.method = method;
        return this; // Returns the current object instance
    }
}


// How it is used:
// WebRequest req = new WebRequest().setUrl("example.com").setMethod("POST");
public class MethodChaining{

    public static void main(String[] args){
        WebRequest req = new WebRequest();
        req.setUrl("example.com").setMethod("POST");
        System.out.println(req.url + " " + req.method);

    }
}



