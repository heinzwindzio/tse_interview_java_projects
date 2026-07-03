
class Printer{
    // A method that expects a Document object
    public void printDocument(Document doc) {
        System.out.println("Printing " + doc.getTitle());
    }
}

class Document{
    private String title = "Report.pdf";

    String getTitle() {
        return title;
    }

    public void sendToPrinter() {
        Printer printer = new Printer();
        // Passes this exact Document instance to the printer
        printer.printDocument(this); 
    }
}

public class PassObject{

    public static void main(String[] args){
        Document doc = new Document();
        doc.sendToPrinter();

        // could have also done it like this
        Printer printer = new Printer();
        printer.printDocument(doc);
    }
}

