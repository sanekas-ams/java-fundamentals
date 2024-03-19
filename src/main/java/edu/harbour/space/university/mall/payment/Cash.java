package edu.harbour.space.university.mall.payment;

public class Cash implements PaymentMethod {
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid " + amount + " using Cash.");
        return true;
    }
}