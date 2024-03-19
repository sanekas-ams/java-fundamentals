package edu.harbour.space.university.mall;

import edu.harbour.space.university.mall.payment.MasterCard;
import edu.harbour.space.university.mall.payment.PayPal;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("1234", 10.99));
        cart.addItem(new Item("5678", 20.99));

        CheckoutService.processCheckout(cart, new PayPal());
        cart.addItem(new Item("1234", 10.99));
        cart.addItem(new Item("5678", 20.99));
        CheckoutService.processCheckout(cart, new MasterCard());
    }
}