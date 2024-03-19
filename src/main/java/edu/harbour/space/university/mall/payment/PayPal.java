package edu.harbour.space.university.mall.payment;

public class PayPal implements PaymentMethod {
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
        return true;
    }
}