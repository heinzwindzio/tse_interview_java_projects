public class Simple0 {
    
    // make the return type generic by adding a type parameter <T>
    public static <T> void printElement(T element) {
        System.out.println(element);
    }

    public static void main(String[] args){

        printElement(0);
        printElement("Hello");
    }


}
