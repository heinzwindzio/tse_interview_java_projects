/** 
 * You can call various methods on an enum class, including:
 * valueOf(String name)
 * values()
 * ordinal()
 * name()
 * 
 */


public class Main {

    public static void main(String[] args){

        TrafficLightEnumClass currentStatus = TrafficLightEnumClass.RED;

        switch (currentStatus) {
            case RED, YELLOW, GREEN -> System.out.println(currentStatus.getAction());
            default -> System.out.println("Invalid status");
        }

        // here's how you get all the values in the enum class
        for (TrafficLightEnumClass tl: TrafficLightEnumClass.values()){
            System.out.println("hey: " + tl);
        }
    }
}
