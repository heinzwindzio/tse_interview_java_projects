public class SimpleMethod {
    
    // make the return type generic by adding a type parameter <T>
    public static <T> void printElement(T element) {

        System.out.println(element);

    }

    // CharSequence is an interface
    public static <T extends CharSequence> void performOps(T element){

        System.out.println("This is the length of the variable passed in: " + element.length());
    }


    public static void main(String[] args){

        printElement(0);
        //performOps(0);  /** will not compile */
        
        printElement(true);
        //performOps(true);  /** will not compile */

        printElement("Hello");
        performOps("Hello");
    }


}
