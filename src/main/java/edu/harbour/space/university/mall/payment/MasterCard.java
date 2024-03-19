package edu.harbour.space.university.mall.payment;

public class MasterCard implements PaymentMethod {
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid " + amount + " using MasterCard.");
        return true;
    }
}