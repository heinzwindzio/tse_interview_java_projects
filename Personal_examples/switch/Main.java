public class Main {
    
    public static void main(String[] args) {

        int  day = 3;
        oldSwitch(day);
        modernArrow(day);
        switchReturn(day);
        switchYield(day);

    }

    private static void oldSwitch(int day){
   
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Old Wednesday"); // Prints Wednesday
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    private static void modernArrow(int day){
        
        // only the matching block executes - no need for a break
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("New Wednesday");
            default -> System.out.println("Invalid day");
        }

    }

    private static void switchReturn(int day){

        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday"; // Commas combine multiple values
            case 6, 7         -> "Weekend";
            default           -> "Invalid day";
        };

        System.out.println("Day Type: " + dayType);
    }
    
    private static void switchYield(int day){

        // can use the 'yield' keyword to return the value of the expression
        int result = switch (day) {
            case 1 -> {
                System.out.println("Starting the week!");
                yield 10;
            }
            case 2 -> {
                System.out.println("Mid week!");
                yield 20;
            }
            case 3 -> {
                System.out.println("Ending the week!");
                yield 30;
            }
            default -> 0;
        };

        System.out.println("Yield: " + result);

    }

    
}


