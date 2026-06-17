public class Main {
    public static void main(String[] args){

        TrafficLightEnumClass currentStatus = TrafficLightEnumClass.RED;

        switch (currentStatus) {
            case RED, YELLOW, GREEN -> System.out.println(currentStatus.getAction());
            default -> System.out.println("Invalid status");
        }

        for (TrafficLightEnumClass tl: TrafficLightEnumClass.values()){
            System.out.println("hey: " + tl);
        }
    }
}
