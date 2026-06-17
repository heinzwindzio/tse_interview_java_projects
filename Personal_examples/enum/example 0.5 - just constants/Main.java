public class Main {
    
    public static void main(String[] args) {

        // Using the enum
        OrderEnumClass currentStatus = OrderEnumClass.PENDING;

        if (currentStatus == OrderEnumClass.PENDING) {
            System.out.println("Order is on the way!");
        }
    }

}


