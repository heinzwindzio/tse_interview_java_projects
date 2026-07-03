// a functional interface has exactly one abstract method

public class Main {

    public static void main(String[] args) {

        String day = "MONDAY";

        int numLetters = switch (day) {
        case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
        case "TUESDAY" -> 7;
        case "THURSDAY", "SATURDAY" -> 8;
        case "WEDNESDAY" -> 9;
        default -> 0;
        };

        System.out.println(numLetters);
    }


}
