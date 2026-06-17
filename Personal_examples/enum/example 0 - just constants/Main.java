

public class Main {
    public static void main(String[] args) {

        // Each enum constant is implicitly treated as a public static final object instance of that enum class
        DayEnumClass today = DayEnumClass.MONDAY;

        if (today == DayEnumClass.MONDAY) {
            System.out.println("It's Monday!");
        }
    }

}
