package edu.harbour.space.university.mall;

import edu.harbour.space.university.mall.payment.PaymentMethod;

public class CheckoutService {
    public static void processCheckout(ShoppingCart cart, PaymentMethod paymentStrategy) {
        if (cart.pay(paymentStrategy)) {
            System.out.println("Checkout process successful.");
        } else {
            System.out.println("Checkout process failed.");
        }
    }
}