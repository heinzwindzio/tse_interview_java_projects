public class PaymentService {

    @ExecutionLimit(maxTimeout = 2000, alertMessage = "Payment processing took too long!")
    public void processTransaction() {
        System.out.println("Processing payment...");
    }
}

