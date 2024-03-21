package Mall;

import java.util.ArrayList;
import Mall.Payment.PaymentMethod;

public class Customer {

    private String name;
    private final ArrayList<ShoppingCart> shoppingCarts = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    public void enterMall(Mall mall) {
        mall.addCustomer(this);
    }

    private ShoppingCart getShoppingCart(ShoppingCart shoppingCart) {
        for (ShoppingCart cart : shoppingCarts) {
            if (cart.equals(shoppingCart)) {
                return cart;
            }
        }
        return null;
    }

   public void retrieveShoppingCart(ShoppingCart shoppingCart) {
        shoppingCarts.add(shoppingCart);
   }

   public void addItem(ShoppingCart shoppingCart, Item item) {
        ShoppingCart cart = getShoppingCart(shoppingCart);
        if(cart != null) {
            cart.addItem(item);
        }
        else {
            System.out.println("Choose a Shopping Cart that exists");
        }
   }

   public Double getBalance() {
        double price = 0;
        for(ShoppingCart shoppingCart: shoppingCarts) {
            price += shoppingCart.getTotal();
        }
        return price;
   }

   /*
   public void pay(double amountAvailable, String paymentMethod) {

        switch (paymentMethod) {
            case 'Cash' -> {
                return
            }
        }
   }
    */




}

