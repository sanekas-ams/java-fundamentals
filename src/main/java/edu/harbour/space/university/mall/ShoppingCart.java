package edu.harbour.space.university.mall;

import edu.harbour.space.university.mall.payment.PaymentMethod;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public double calculateTotal() {
        double sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public boolean pay(PaymentMethod paymentStrategy) {
        double amount = calculateTotal();
        return paymentStrategy.pay(amount);
    }
}