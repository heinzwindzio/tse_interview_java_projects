import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample3 {
    public static void main(String[] args) {
        
        
        // 1. Create test data
        List<Employee> staff = new ArrayList<>();
        staff.add(new Employee("Alice", 50000));
        staff.add(new Employee("Bob", 60000));

        // 2. Define a Consumer that alters internal state (gives a 10% raise)
        Consumer<Employee> giveRaise = emp -> emp.setSalary(emp.getSalary() * 1.10);

        // 3. Pass the Consumer into the forEach method
        // or you could simply pass it the lambda expression directly
        staff.forEach(giveRaise);

        // 4. Verify the state changes
        staff.forEach(System.out::println);
    }
}
