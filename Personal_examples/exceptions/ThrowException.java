import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowException {
    
    public static void main(String[] args) {
        

        try{
            readFile("file.txt");

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } finally {
            System.out.println("In the finally block to close the connection");
        }

        System.out.println("Executing code after the exception is caught");


    }

    public static void readFile(String path) throws IOException {
        
        BufferedReader br = new BufferedReader(new FileReader("file.txt")); 
        System.out.println(br.readLine());

        // FileReader fr = new FileReader(path); // Might throw FileNotFoundException
    }
}
