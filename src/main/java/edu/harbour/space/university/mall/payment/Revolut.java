package edu.harbour.space.university.mall.payment;

public class Revolut implements PaymentMethod {
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid " + amount + " using Revolut.");
        return true;
    }
}
