package Mall;

import Mall.Payment.PaymentMethod;

public class CheckoutService {


    public void checkout(Customer customer, PaymentMethod paymentMethod)
    {
        paymentMethod.pay(customer.getBalance());
    }
}
