import java.util.Collections;
import java.util.List;

/**
 * Use colon with Java <= 11
 */
public class SwitchExamples {
    
    public static void main(String[] args) {

        int  value = 3;

        oldJava11Switch(value);
        oldJava11SwitchReturn(value); // need to end the switch return expression with a semicolon

        modernArrow(value);
        modernArrowhWithAReturn(value);  // need to end the switch return expression with a semicolon

    }

        private static void oldJava11Switch(int day){
   
        System.out.println("This is the pre-Java 11 way of handling a switch statement");

        // need to use break statements otherwise it will drop through
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday"); // Prints Wednesday
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    private static void oldJava11SwitchReturn(int day){
   

        // need to use a yield to return the value of the expression
        String today = switch (day) {
            case 1:
                System.out.println("Monday");
                yield "Monday";
            case 2:
                System.out.println("Tuesday");
                yield "Tuesday";
            case 3:
                System.out.println("Wednesday"); 
                yield "Wednesday";
            default:
                System.out.println("Invalid day");
                yield "Invalid day";
        };
        
        System.out.println("This is the pre-Java 11 way with a switch return. Yield: " + today);

    }

    private static void modernArrow(int day){
        
        System.out.println("This is the post-Java 11 way of handling a switch statement, with an arrow");

        // only the matching block executes - no need for a break
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Invalid day");
        }

    }

    private static void modernArrowhWithAReturn(int day){

        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday"; 
            case 6, 7         -> "Weekend";
            default           -> "Invalid day";
        };

        System.out.println("Switch with a return. Return: " + dayType);
    }
    

    
}


