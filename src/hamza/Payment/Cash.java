package Mall.Payment;

public class Cash implements PaymentMethod{

    public void pay(double total) {
        System.out.println("Succesful Payment with Cash");

    }
}
