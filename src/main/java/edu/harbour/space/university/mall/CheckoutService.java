package edu.harbour.space.university.mall;

import java.util.Map;

public class CheckoutService {
    boolean check(Customer customer) {
        ShoppingCart shoppingCart=customer.getShoppingCart();
        double sum = 0;
        Map<Item, Integer> items = customer.getChosenItems();
        for (Item i : items.keySet()) {
            if (items.get(i) > i.getNumber()) {
                return false;
            }
            sum += i.getNumber() * i.getPrice();
        }
        if (sum > shoppingCart.getBalance()) {
            return false;
        } else {
            shoppingCart.decreaseValue(sum);
            for (Item i : items.keySet()) {
                if (items.get(i) > i.getNumber()) {
                    i.decreaseNumber(items.get(i));
                }
                return true;
            }
        }
        return true;

    }
}
