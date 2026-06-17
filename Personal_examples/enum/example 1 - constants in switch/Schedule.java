

public class Schedule {
    public void planDay(DayEnumClass day) {
        // Enums work natively and cleanly with switch statements
        switch (day) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend! Relax.");
                break;
            case MONDAY:
                System.out.println("Back to work.");
                break;
            default:
                System.out.println("Mid-week hustle.");
                break;
        }
    }
}

